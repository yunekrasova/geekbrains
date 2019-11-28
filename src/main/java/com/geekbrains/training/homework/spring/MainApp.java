package com.geekbrains.training.homework.spring;

import com.geekbrains.training.homework.spring.exception.TaskBDException;
import com.geekbrains.training.homework.spring.object.Task;
import com.geekbrains.training.homework.spring.service.TaskService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) throws TaskBDException {
        TaskService taskList = new TaskService(new TaskToHibernateRepository());

//      taskList.addTask(new Task(null, "Первый", "Владелец1",
//                "Исполнитель1", "Описание1", Task.StatusTask.NEW));
//taskList.delTask(1L);
//        taskList.addTask(new Task(2L, "Второй", "Владелец2",
//                "Исполнитель2", "Описание2",  Task.StatusTask.NEW));
//        taskList.addTask(new Task(3L, "Третий", "Владелец1",
//                "Исполнитель1", "Описание1",  Task.StatusTask.NEW));
//        taskList.addTask(new Task(4L, "Третий", "Владелец1",
//                "Исполнитель1", "Описание1",  Task.StatusTask.CLOSE));
//        taskList.addTask(new Task(5L, "Третий", "Владелец1",
//                "Исполнитель1", "Описание1", Task.StatusTask.INWORK));
//        taskList.addTask(new Task(6L, "Третий", "Владелец1",
//                "Исполнитель1", "Описание1", Task.StatusTask.INWORK));
//        taskList.addTask(new Task(7L, "Третий", "Владелец1",
//                "Исполнитель1", "Описание1",  Task.StatusTask.NEW));
//        taskList.addTask(new Task(8L, "Третий", "Владелец1",
//                "Исполнитель1", "Описание1",  Task.StatusTask.NEW));
//        taskList.addTask(new Task(9L, "Третий", "Владелец1",
//                "Исполнитель1", "Описание1",  Task.StatusTask.NEW));
//        taskList.addTask(new Task(10L, "Десять", "Владелец1",
//                "Исполнитель1", "Описание1", Task.StatusTask.CLOSE));
//        taskList.addTask(new Task(11L, "Третий", "Владелец1",
//                "Исполнитель1", "Описание1",  Task.StatusTask.NEW));
//        taskList.addTask(new Task(12L, "Третий", "Владелец1",
//                "Исполнитель1", "Описание1", Task.StatusTask.CLOSE));
//        taskList.addTask(new Task(13L, "Одинадцать", "Владелец1",
//                "Исполнитель1", "Описание1", Task.StatusTask.CLOSE));
//        System.out.println(taskList.printListTask());
//        System.out.println(taskList.taskListByStatus(Task.StatusTask.NEW));
//        System.out.println("------------------------");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConf.class);

        TaskService taskService = context.getBean("taskService", TaskService.class);
        taskService.addTask(new Task(13L, "Одинадцать", "Владелец1", "Исполнитель1", "Описание1", Task.StatusTask.CLOSE));
        System.out.println(taskList.printListTask());
        context.close();

    }
}
