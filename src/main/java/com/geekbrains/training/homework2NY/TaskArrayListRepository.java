package com.geekbrains.training.homework2NY;

import com.geekbrains.training.homework2NY.exception.*;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskArrayListRepository implements UserTask {
    private ArrayList<Task> arrayListTask;

    public TaskArrayListRepository() {
        prepareTask();
    }

    @Override
    public void prepareTask() {
        arrayListTask = new ArrayList<>();
        arrayListTask.toArray();
    }

    public boolean chekUniq(Task taskOne, ArrayList<Task> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            if (taskOne.equals(tasks.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void addTask(Task task) {
        if (chekUniq(task, arrayListTask)) {
            if (!(arrayListTask.add(task))) {
                throw new FullTaskArrayListException();
            }
        } else {
            throw new NoUniqueException(task.getIdTask());
        }
    }


    @Override
    public String printListTask() {
        String textTask = "";
        for (Task t : arrayListTask) {
            textTask += t + "\n";
        }
        return textTask;
    }

    @Override
    public boolean delTask(Long numTask) {

        for (int i = 0; i < arrayListTask.size(); i++) {
            if (arrayListTask.get(i).getIdTask().equals(numTask)) {
                arrayListTask.remove(i);
                return true;//так как у нас проверка на уникальность Id при добавлении, то удаляем первый встречанный
            }
        }
        return false;
    }

    @Override
    public boolean delTask(String nameTask) {
        boolean res = false;
        for (Iterator<Task> iter = arrayListTask.iterator(); iter.hasNext(); ) {
            Task task = iter.next();
            if (task.getNameTask().equals(nameTask)) {
                iter.remove();
                res = true;
            }
       /* for (int i = 0; i <  arrayListTask.size(); i++) {
            if (arrayListTask.get(i).getNameTask().equals(nameTask)) {
                arrayListTask.remove(i);
                i-=1;
                res = true;
            }
        }*/
        }
        return res;
    }
}
