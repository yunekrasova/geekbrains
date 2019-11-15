package com.geekbrains.training.homework2NY;

import java.util.ArrayList;

public interface UserTask {
    void prepareTask();
    void addTask(Task task);
    boolean delTask(Long numTask);
    boolean delTask(String nameTask);
    String printListTask();
    ArrayList<Task> getArrayListTask();
}
