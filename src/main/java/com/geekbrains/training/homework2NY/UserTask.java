package com.geekbrains.training.homework2NY;

public interface UserTask {
    void prepareTask();
    boolean addTask(Task task);
    boolean delTask(Long numTask);
    boolean delTask(String nameTask);
    String printListTask();
}
