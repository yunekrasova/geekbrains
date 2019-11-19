package com.geekbrains.training.homework2NY;

import com.geekbrains.training.homework2NY.exception.*;

import java.io.*;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.*;

/*Создайте класс TaskTracker, который хранит в себе массив из 10 задач.
Этот класс должен позволять добавлять задачу в массив. Если весь массив заполнен,
 то при попытке добавить новую задачу в консоль, необходимо вывести сообщение: “Список задач заполнен”.
 */
public class TaskService {
    //   UserTask userTask = new TaskRepository();
    UserTask userTask = new TaskArrayListRepository();

    public void TaskService() {
        prepareTask();
    }

    public void prepareTask() {
        userTask.prepareTask();
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

    public void printListTask() {
        System.out.println(userTask.printListTask());
    }

    public void delTask(Long numTask) {
        if (userTask.delTask(numTask)) {
            System.out.println("Задачи с ID=" + numTask + " удалена из списка задач.");
        } else {
            System.out.println("Задачи с ID=" + numTask + " нет в списке задач.");
        }
    }

    public void delTask(String nameTask) {
        if (userTask.delTask(nameTask)) {
            System.out.println("Задачи c названием '" + nameTask + "' удалена из списка задач.");
        } else {
            System.out.println("Задачи  c названием '" + nameTask + "' нет в списке задач.");
        }

    }

    public List<Task> taskListByStatus(Task.StatusTask statusTask) {
        return userTask.getArrayListTask().stream()
                .filter(task -> task.getStatusTask().equals(statusTask))
                .collect(Collectors.toList());
    }

    public boolean checkForIdTaskList(Long idTask) {
        return userTask.getArrayListTask().stream()
                .anyMatch(task -> task.getIdTask().equals(idTask));
    }

    public List<Task> sortByStatusTaskList() {
        return userTask.getArrayListTask().stream()
                .sorted((s1, s2) -> s1.getStatusTask().getRang() - s2.getStatusTask().getRang())
                .collect(Collectors.toList());
    }

    public long countTaskByStatus(Task.StatusTask statusTask) {
        return userTask.getArrayListTask().stream()
                .filter(task -> task.getStatusTask().equals(statusTask))
                .count();
    }

    public boolean exportListTaskToFile(String outNameFile) {
        File outFile = new File(outNameFile);
        List<Task> allTaskList = userTask.getArrayListTask().stream().collect(Collectors.toList());

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
        /*чуть позже доделаю распарсивание строки и запись в Task*/
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
