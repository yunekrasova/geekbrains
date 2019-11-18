package com.geekbrains.training.homework2NY;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        /*   Box<Apple> boxApp1 = new Box<>();
        Box<Apple> boxApp2 = new Box<>();
        Box<Orange> boxOrn1 = new Box<>();
        Box<Orange> boxOrn2 = new Box<>();
        Apple apple = new Apple();
        Orange orange = new Orange();

        if (boxOrn2.addFruitToBox(orange)) {
            System.out.println("Апельсин добавлен");
        }

        boxApp1.addFruitToBox(apple);
        boxApp1.addFruitToBox(apple);
        boxApp2.addFruitToBox(apple);

        System.out.println(boxApp1.getWeight());
        System.out.println(boxApp2.getWeight());

        if (boxApp1.compare(boxApp2)) {
            System.out.println("Коробки одинакого веса");
        } else {
            System.out.println("Коробки разного веса");
        }
*/
        System.out.println("------------------------");
      /*  WorkWithArray myArr = new WorkWithArray();
        String[][] Array4x4 =  {{"1", "2", "3","d"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        System.out.println(myArr.checkWorkWithArray(Array4x4));
*/

        TaskService taskList = new TaskService();

        taskList.addTask(new Task(1L, "Первый", "Владелец1",
                "Исполнитель1", "Описание1", Task.StatusTask.NEW));
        taskList.addTask(new Task(1L, "Второй", "Владелец2",
                "Исполнитель2", "Описание2",  Task.StatusTask.NEW));
        taskList.addTask(new Task(3L, "Третий", "Владелец1",
                "Исполнитель1", "Описание1",  Task.StatusTask.NEW));
        taskList.addTask(new Task(4L, "Третий", "Владелец1",
                "Исполнитель1", "Описание1",  Task.StatusTask.CLOSE));
        taskList.addTask(new Task(5L, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", Task.StatusTask.INWORK));
        taskList.addTask(new Task(6L, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", Task.StatusTask.INWORK));
        taskList.addTask(new Task(7L, "Третий", "Владелец1",
                "Исполнитель1", "Описание1",  Task.StatusTask.NEW));
        taskList.addTask(new Task(8L, "Третий", "Владелец1",
                "Исполнитель1", "Описание1",  Task.StatusTask.NEW));
        taskList.addTask(new Task(9L, "Третий", "Владелец1",
                "Исполнитель1", "Описание1",  Task.StatusTask.NEW));
        taskList.addTask(new Task(10L, "Десять", "Владелец1",
                "Исполнитель1", "Описание1", Task.StatusTask.CLOSE));
        taskList.addTask(new Task(11L, "Третий", "Владелец1",
                "Исполнитель1", "Описание1",  Task.StatusTask.NEW));
        taskList.addTask(new Task(12L, "Третий", "Владелец1",
                "Исполнитель1", "Описание1", Task.StatusTask.CLOSE));
        taskList.addTask(new Task(13L, "Одинадцать", "Владелец1",
                "Исполнитель1", "Описание1", Task.StatusTask.CLOSE));
        System.out.println("------------------------");

        String fileName = "tasklist.txt";
     /*   if (taskList.exportListTaskToFile(fileName))
        {
            System.out.println("Все задачи записаны в файл " +fileName);
        }
        else {System.out.println("Система не смогла записать задачи в файл с именем "+fileName+". Скорее всего такой файл уже существует.");}
        */

        taskList.importListTaskToFile(fileName);

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
     /*   taskList.printListTask();
        System.out.println("------------------------");

        taskList.delTask(10L);
        //  taskList.delTask(13L);
        taskList.delTask("Третий");
        taskList.delTask("Первый");
        System.out.println("------------------------");

        taskList.printListTask();

 */


    }
}

