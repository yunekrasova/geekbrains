package com.geekbrains.training.homework2NY;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("------------------------");

        TaskService taskList = new TaskService();
//
//        taskList.addTask(new Task(1L, "Первый", "Владелец1",
//                "Исполнитель1", "Описание1", Task.StatusTask.NEW));
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
        System.out.println("------------------------");
/*
        String fileName = "tasklist.txt";
        if (taskList.exportListTaskToFile(fileName))
        {
            System.out.println("Все задачи записаны в файл " +fileName);
        }
        else {System.out.println("Система не смогла записать задачи в файл с именем "+fileName+". Скорее всего такой файл уже существует.");}

        taskList.importListTaskToFile(fileName);
        System.out.println("------------------------");
        taskList.printListTask();

 */

  /*      Task.StatusTask myStatus= Task.StatusTask.NEW;
        System.out.println("Список задач со статусом '"+myStatus.getTitle()+"':");
        List<Task> taskListByStatus = taskList.taskListByStatus(myStatus);

        for (Task i : taskListByStatus) {
            System.out.println(i);
        }

        System.out.println("------------------------");

        Long myId = 16L;
        if (taskList.checkForIdTaskList(myId))
        {
            System.out.println("Задача с ID="+myId+" существует");
        }
        else {System.out.println("Задача с ID="+myId+" не существует");}

        System.out.println("------------------------");

        List<Task> sortTaskList =taskList.sortByStatusTaskList();

        System.out.println("Список задач, отсортированных по статусу:");
        for (Task j : sortTaskList) {
            System.out.println(j);
        }

        System.out.println("------------------------");
        System.out.println("Количество задач со статусом '"+myStatus+"' равно "+taskList.countTaskByStatus(myStatus));
*/
       taskList.printListTask();
//        System.out.println("------------------------");
//
//        taskList.delTask(10L);
//         taskList.delTask(13L);
//        taskList.delTask("Третий");
//        taskList.delTask("Первый");
//        System.out.println("------------------------");
//
//        taskList.printListTask();

     }
}

