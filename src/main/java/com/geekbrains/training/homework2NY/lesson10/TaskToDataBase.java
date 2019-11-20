package com.geekbrains.training.homework2NY.lesson10;

import com.geekbrains.training.homework2NY.Task;
import com.geekbrains.training.homework2NY.UserTask;

import java.sql.*;
import java.util.ArrayList;

public class TaskToDataBase implements UserTask {
    private static Connection connection;
    private static Statement stmt;

    public TaskToDataBase() {
        prepareTask();
    }

    public void prepareTask() {
        try {
            connect();
            stmt.executeUpdate("CREATE TABLE task (\n" +
                    "        id_task   NUMBER(10) PRIMARY KEY NOT NULL,\n" +
                    "        name_task  VARCHAR2(500),\n" +
                    "        owner_task VARCHAR2(100),\n" +
                    "        executer_task VARCHAR2(100),\n" +
                    "        desc_task VARCHAR2(500),\n" +
                    "        status_task VARCHAR2(100)\n" +
                    "    )");
        } catch (SQLException e) {
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            disconnect();
        }
    }

    public void addTask(Task task) {
        try {
            connect();
            stmt.executeUpdate("INSERT INTO task (id_task, name_task,owner_task, executer_task,desc_task,status_task) VALUES ('+" +
                    task.getIdTask() + "' ,'" +
                    task.getNameTask() + "' ,'" +
                    task.getOwnerTask() + "', '" +
                    task.getExecuterTask() + "' ,'" +
                    task.getDescTask() + "' ,'" +
                    task.getStatusTask() + "')");
            disconnect();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean delTask(Long numTask) {
        try {
            connect();
            stmt.executeUpdate("DELETE FROM task WHERE id_task = '" + numTask + "'");
            disconnect();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean delTask(String nameTask) {
        try {
            connect();
            stmt.executeUpdate("DELETE FROM task WHERE name_task = '" + nameTask + "'");
            disconnect();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public String printListTask() {
        String textTask = "";

        try {
            connect();
            ResultSet rs = stmt.executeQuery("SELECT * FROM task");
            while (rs.next()) {
           textTask += String.format("ID:%s, название:%s, владелец:%s, имя исполнителя:%s, описание:%s, статуc:%s",
                   rs.getString(1), rs.getString(2), rs.getString(3),
                   rs.getString(4), rs.getString(5), rs.getString(6))
                   + "\n";
            }
            disconnect();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return textTask;
    }

    public ArrayList<Task> getArrayListTask() {
        return null;
    }

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.66.42:1521:crm", "yunekrasova", "Kess278032");
        stmt = connection.createStatement();
        connection.setAutoCommit(true);
    }

    public static void disconnect() {
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
