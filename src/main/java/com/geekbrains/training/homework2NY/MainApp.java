package com.geekbrains.training.homework2NY;

import com.geekbrains.training.homework2NY.lesson4.*;

public class MainApp {
    public static void main(String[] args) {
      /*  WorkWithArray myArr = new WorkWithArray();
        String[][] Array4x4 =  {{"1", "2", "3","d"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        System.out.println(myArr.checkWorkWithArray(Array4x4));
*/
        TaskService taskList = new TaskService();

        taskList.addTask(new Task(1L, "Первый", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(1L, "Второй", "Владелец2",
                "Исполнитель2", "Описание2", "Новый"));
        taskList.addTask(new Task(3L, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(4L, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(5L, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(6L, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(7L, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(8L, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(9L, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(10L, "Десять", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(11L, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(12L, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(13L, "Одинадцать", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        System.out.println("------------------------");

        taskList.printListTask();
        System.out.println("------------------------");

        taskList.delTask(11L);
        taskList.delTask("Третий");
        taskList.delTask("Первый");
        System.out.println("------------------------");

        taskList.printListTask();
    }
}

