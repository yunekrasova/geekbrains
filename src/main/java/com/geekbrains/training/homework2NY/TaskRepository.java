package com.geekbrains.training.homework2NY;

import com.geekbrains.training.homework2NY.exception.*;

public class TaskRepository implements UserTask {
    private Task[] listTask;

    public TaskRepository() {
        prepareTask();
    }

    @Override
    public void prepareTask() {
        listTask = new Task[10];
    }

    public boolean chekUniq(Task taskOne, Task[] tasks) {
        for (int i = 0; i < tasks.length; i++) {
            if (taskOne.equals(tasks[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void addTask(Task task) {
        if (chekUniq(task, listTask)) {
            for (int i = 0; i < listTask.length; i++) {
                if (listTask[i] == null) {
                    listTask[i] = task;
                    break;
                }
            }
        } else {
            throw new NoUniqueException(task.getIdTask());
        }
        throw new FullTaskException();
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

