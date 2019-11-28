package com.geekbrains.training.homework.spring.service;

import com.geekbrains.training.homework.spring.exception.FullTaskException;
import com.geekbrains.training.homework.spring.exception.NoUniqueException;
import com.geekbrains.training.homework.spring.exception.TaskBDException;
import com.geekbrains.training.homework.spring.object.Task;
import com.geekbrains.training.homework.spring.UserTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Service(value = "taskService")
public class TaskService {
    private UserTask userTask;

    public TaskService(UserTask userTask) {
        this.userTask = userTask;
        try {
            userTask.prepareTask();
        } catch (TaskBDException e) {
            e.printStackTrace();
        }
    }

    @Autowired
    public void setUserTask(UserTask userTask) {
        this.userTask = userTask;
    }

    public void addTask(Task task) {
        try {
            userTask.addTask(task);
        } catch (NoUniqueException e) {
            System.out.println((e.toString()));
        } catch (FullTaskException e) {
            System.out.println((e.toString()));
        }
    }

    public void delTask(Long numTask) {
        try {
            userTask.delTask(numTask);
        } catch (TaskBDException e) {
            e.printStackTrace();
        }
    }

    public void delTask(String nameTask) {
        try {
            userTask.delTask(nameTask);
        } catch (TaskBDException e) {
            e.printStackTrace();
        }
    }

    public String  printListTask() {
        return userTask.printListTask().stream()
              .map(Task::toString)
              .collect(Collectors.joining("\n"));
    }

    public String taskListByStatus(Task.StatusTask statusTask) {
        return userTask.printListTask().stream()
                .filter(task -> task.getStatusTask().equals(statusTask))
                .map(Task::toString)
                .collect(Collectors.joining("\n"));
    }

    public boolean checkForIdTaskList(Long idTask) {
        return userTask.printListTask().stream()
                .anyMatch(task -> task.getIdTask().equals(idTask));
    }

    public String sortByStatusTaskList() {
        return userTask.printListTask().stream()
                .sorted((s1, s2) -> s1.getStatusTask().getRang() - s2.getStatusTask().getRang())
                .map(Task::toString)
                .collect(Collectors.joining("\n"));
    }

    public long countTaskByStatus(Task.StatusTask statusTask) {
        return userTask.printListTask().stream()
                .filter(task -> task.getStatusTask().equals(statusTask))
                .count();
    }

    public boolean exportListTaskToFile(String outNameFile) {
        File outFile = new File(outNameFile);
        List<Task> allTaskList = userTask.printListTask().stream().collect(Collectors.toList());

        if (outFile.exists()) {
            return false;
        }
        try (BufferedWriter out = new BufferedWriter(new FileWriter(outFile))) {
            for (Task t : allTaskList) {
                out.write(t.toStringDataTask() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void importListTaskToFile(String inNameFile) {
        File inFile = new File(inNameFile);
        String lineTask;
        String[] stroka ;
        String idTask;
        try (BufferedReader in = new BufferedReader(new FileReader(inFile))) {
            lineTask = in.readLine();
            Pattern pat = Pattern.compile(":|,");

            while (lineTask != null) {
                stroka = pat.split(lineTask);
                idTask = stroka[1].trim()+"1";
                this.addTask(new Task(Long.parseLong(idTask), stroka[3].trim(), stroka[5].trim(), stroka[7].trim(),
                        stroka[9].trim(), Task.StatusTask.valueOf(stroka[11].trim())));
                lineTask = in.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
       }

}
