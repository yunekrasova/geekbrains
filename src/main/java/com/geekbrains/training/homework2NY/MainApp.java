package com.geekbrains.training.homework2NY;

public class MainApp {
    public static void main(String[] args) {
        TaskService taskList = new TaskService();

        taskList.addTask(new Task(1L, "Первый", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(2L, "Второй", "Владелец2",
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

