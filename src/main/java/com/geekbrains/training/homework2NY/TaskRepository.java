package com.geekbrains.training.homework2NY;

public class TaskRepository implements UserTask {
    private Task[] listTask;

    public TaskRepository() {
        prepareTask();
    }

    @Override
    public void prepareTask() {
        listTask = new Task[10];
    }

    @Override
    public boolean addTask(Task task) {
        for (int i = 0; i < listTask.length; i++) {
            if (listTask[i] == null) {
                listTask[i] = task;
                return true;
            }
        }
     return false;
    }

    @Override
    public String printListTask() {
        String textTask = "";
        for (Task t : listTask) {
            if (t != null) {
                textTask += t + "\n";
            }
        }
        return textTask;
    }


    @Override
    public boolean delTask(Long numTask) {
        boolean res = false;

        for (int i = 0; i < listTask.length; i++) {
            if (listTask[i] != null && listTask[i].getIdTask().equals(numTask)) {
                listTask[i] = null;
                res = true;
            }
        }
        return res;
    }

    @Override
    public boolean delTask(String nameTask) {
        boolean res = false;

        for (int i = 0; i < listTask.length; i++) {
            if (listTask[i] != null && listTask[i].getNameTask().equals(nameTask)) {
                listTask[i] = null;
                res = true;
            }
        }
        return res;
    }
}

