package com.geekbrains.training.homework.spring;

import com.geekbrains.training.homework.spring.exception.TaskBDException;
import com.geekbrains.training.homework.spring.object.Task;

import java.util.List;

public interface UserTask {
    void prepareTask() throws TaskBDException;
    void addTask(Task task);
    void delTask(Long numTask) throws TaskBDException;
    void delTask(String nameTask) throws TaskBDException;
    List<Task>  printListTask();
}
