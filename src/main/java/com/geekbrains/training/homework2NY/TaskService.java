package com.geekbrains.training.homework2NY;

import com.geekbrains.training.homework2NY.exception.*;

/*Создайте класс TaskTracker, который хранит в себе массив из 10 задач.
Этот класс должен позволять добавлять задачу в массив. Если весь массив заполнен,
 то при попытке добавить новую задачу в консоль, необходимо вывести сообщение: “Список задач заполнен”.
 */
public class TaskService {
    UserTask userTask = new TaskRepository();

    public void TaskService() {
        prepareTask();
    }

    public void prepareTask() {
        userTask.prepareTask();
    }

    public void addTask(Task task) {
        try {
            userTask.addTask(task);
        } catch (NoUniqueException e) {
            System.out.println((e.toString()));
        } catch (FullTaskException e) {
            System.out.println((e.toString()));
        }
    }

    public void printListTask() {
        System.out.println(userTask.printListTask());
    }

    public void delTask(Long numTask) {
        if (userTask.delTask(numTask)) {
            System.out.println("Задачи с ID=" + numTask + " удалена из списка задач.");
        } else {
            System.out.println("Задачи с ID=" + numTask + " нет в списке задач.");

        }
    }

    public void delTask(String nameTask) {
        if (userTask.delTask(nameTask)) {
            System.out.println("Задачи c названием '" + nameTask + "' удалена из списка задач.");
        } else {
            System.out.println("Задачи  c названием '" + nameTask + "' нет в списке задач.");

        }

    }


}
