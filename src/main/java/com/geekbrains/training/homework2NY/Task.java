package com.geekbrains.training.homework2NY;
/*cоздайте класс Task (задача).
 У задачи должны быть следующие свойства:
  id, название, имя владельца задачи, имя исполнителя,
  описание, статус. */

public class Task {
    private int idTask;
    private String nameTask;
    private String ownerTask;
    private String executerTask;
    private String descTask;
    private String statusTask;

    public Task(int idTask, String nameTask, String ownerTask, String executerTask, String descTask, String statusTask) {
        this.idTask = idTask;
        this.nameTask = nameTask;
        this.ownerTask = ownerTask;
        this.executerTask = executerTask;
        this.descTask = descTask;
        this.statusTask = statusTask;
    }

    public int getIdTask() {
        return idTask;
    }

    public String getNameTask() {
        return nameTask;
    }

    @Override
    public String toString() {
        return "Задача ID:" + idTask + ", название: " + nameTask + ", имя владельца задачи:" + ownerTask + ", имя исполнителя: " + executerTask +
                ",  описание:" + descTask + ", статуc: " + statusTask + ".";
    }
}
