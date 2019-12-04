package com.geekbrains.training.homework2NY;

import com.geekbrains.training.homework2NY.exception.TaskBDException;
import com.geekbrains.training.homework2NY.object.Task;

import java.util.ArrayList;
import java.util.List;

public interface UserTask {
    void prepareTask() throws TaskBDException;
    void addTask(Task task);
    void delTask(Long numTask) throws TaskBDException;
    void delTask(String nameTask) throws TaskBDException;
    List<Task> printListTask();
    Task getTask(Long idTask);
    List<Task> getTasksFiltred(Task task);
}
