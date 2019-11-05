package com.geekbrains.training.homework2NY;

/*Создайте класс TaskTracker, который хранит в себе массив из 10 задач.
Этот класс должен позволять добавлять задачу в массив. Если весь массив заполнен,
 то при попытке добавить новую задачу в консоль, необходимо вывести сообщение: “Список задач заполнен”.
 */
public class TaskTracker {
    private Task[] listTask;

    public TaskTracker() {
        listTask = new Task[10];
    }

    public void addTask(Task task) {
        for (int i = 0; i < listTask.length; i++) {
            if (listTask[i] == null) {
                listTask[i] = task;
                return;
            }

        }
        System.out.println("Список задач заполнен.");
    }

    public void printList() {
        for (int i = 0; i < listTask.length; i++) {
            if (listTask[i] != null) {
                System.out.println(listTask[i].toString());
            }
        }
    }

    public void delTask(int numTask) {
        int res = -1;

        for (int i = 0; i < listTask.length; i++) {
            if (listTask[i] != null && listTask[i].getIdTask() == numTask) {
                listTask[i] = null;
                System.out.println("Задачи с ID=" + numTask + " удалена из списка задач.");
                res = i;
            }
        }
        if (res < 0) {
            System.out.println("Задачи с ID=" + numTask + " нет в списке задач.");
        } else {
            System.out.println("Задачи с ID=" + numTask + " удалена из списка задач.");
        }
    }

    public void delTask(String nameTask) {
        int res = -1;
        for (int i = 0; i < listTask.length; i++) {
            if (listTask[i] != null && listTask[i].getNameTask() == nameTask) {
                listTask[i] = null;
                res = i;
            }
        }
        if (res < 0) {
            System.out.println("Задачи  c названием '" + nameTask + "' нет в списке задач.");
        } else {
            System.out.println("Задачи c названием '" + nameTask + "' удалена из списка задач.");

        }
    }
}
