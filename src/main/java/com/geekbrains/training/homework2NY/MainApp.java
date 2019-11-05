package com.geekbrains.training.homework2NY;

public class MainApp {
    public static void main(String[] args) {
         TaskTracker taskList = new TaskTracker();
        taskList.addTask(new Task(1, "Первый", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(2, "Второй", "Владелец2",
                "Исполнитель2", "Описание2", "Новый"));
        taskList.addTask(new Task(3, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(4, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(5, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(6, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(7, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(8, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(9, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(10, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(11, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(12, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));
        taskList.addTask(new Task(13, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", "Новый"));

        taskList.printList();
        taskList.delTask(11);
        taskList.delTask("Третий");
        taskList.delTask("Первый");
        taskList.printList();
    }

}
