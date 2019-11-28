package com.geekbrains.training.homework.spring;

import com.geekbrains.training.homework.spring.exception.TaskBDException;
import com.geekbrains.training.homework.spring.object.Task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TaskToHibernateRepository implements UserTask {
    private SessionFactory factory;

    public TaskToHibernateRepository() throws TaskBDException {
        prepareTask();
    }

    public void prepareTask() throws TaskBDException {
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
    }

    @Autowired
    public TaskToHibernateRepository(SessionFactory factory) {
        this.factory = factory;
    }

    public void addTask(Task task) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.merge(task);
        session.getTransaction().commit();
    }

    public void delTask(Long numTask) throws TaskBDException {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            if (session.get(Task.class, numTask) == null) {
                throw new TaskBDException("Задача не найдена или уже удалена.");
            }

            session.createQuery("DELETE FROM Task a WHERE a.idTask=:idTask")
                    .setParameter("idTask", numTask)
                    .executeUpdate();
            session.getTransaction().commit();
            session.close();
        } catch (IOException e) {
            throw new TaskBDException("Система не смогла удалить задачу.");
        }
    }

    public void delTask(String nameTask) throws TaskBDException {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            if (session.get(Task.class, nameTask) == null) {
                throw new TaskBDException("Задача не найдена или уже удалена.");
            }

            session.createQuery("DELETE FROM Task a WHERE a.name_task=:nameTask")
                    .setParameter("nameTask", nameTask)
                    .executeUpdate();
            session.getTransaction().commit();
            session.close();
        } catch (IOException e) {
            throw new TaskBDException("Система не смогла удалить задачу.");
        }
    }

    @Override
    public List<Task> printListTask() {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List<Task> taskList = session.createQuery("SELECT a FROM Task a", Task.class).getResultList();
        session.getTransaction().commit();
        return taskList;
    }

//    public Task getTask(Long idTask) {
//        Session session = factory.getCurrentSession();
//        session.beginTransaction();
//        Task task = session.get(Task.class, idTask);
//        session.getTransaction().commit();
//        return task;
//    }
}
