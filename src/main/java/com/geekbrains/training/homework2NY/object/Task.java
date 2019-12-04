package com.geekbrains.training.homework2NY.object;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "task")
public class Task implements Serializable {
    public enum StatusTask {
        NEW("Новый", 1),
        INWORK("В работе", 2),
        CLOSE("Закрыт", 3);

        private String title;
        private int rang;

        StatusTask(String title, int rang) {
            this.title = title;
            this.rang = rang;
        }

        public String getTitle() {
            return title;
        }

        public int getRang() {
            return rang;
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "taskId")
    @SequenceGenerator(name = "taskId", sequenceName = "taskid", allocationSize = 1)
    @Column(name = "id_task", nullable = false)
    Long idTask;

    @Column(name = "name_task")
    String nameTask;

    @Column(name = "owner_task")
    String ownerTask;

    @Column(name = "executer_task")
    String executerTask;

    @Column(name = "desc_task")
    String descTask;

    @NotNull
    @Enumerated(javax.persistence.EnumType.STRING)
    @Column(name = "status_task")
    StatusTask statusTask;

    public Task(Long idTask, String nameTask, String ownerTask, String executerTask, String descTask, StatusTask statusTask) {
        this.idTask = idTask;
        this.nameTask = nameTask;
        this.ownerTask = ownerTask;
        this.executerTask = executerTask;
        this.descTask = descTask;
        this.statusTask = statusTask;
    }

    public Task() {
    }

    public Long getIdTask() {
        return idTask;
    }

    public String getNameTask() {
        return nameTask;
    }

    public StatusTask getStatusTask() {
        return statusTask;
    }

    public String getOwnerTask() {
        return ownerTask;
    }

    public String getExecuterTask() {
        return executerTask;
    }

    public String getDescTask() {
        return descTask;
    }

    public void setIdTask(Long idTask) {
        this.idTask = idTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public void setOwnerTask(String ownerTask) {
        this.ownerTask = ownerTask;
    }

    public void setExecuterTask(String executerTask) {
        this.executerTask = executerTask;
    }

    public void setDescTask(String descTask) {
        this.descTask = descTask;
    }

    public void setStatusTask(StatusTask statusTask) {
        this.statusTask = statusTask;
    }

    @Override
    public String toString() {
        return String.format("Задача ID:%d, название: %s, имя владельца задачи:%s, имя исполнителя: %s, описание: %s, статуc: %s.",
                idTask, nameTask, ownerTask, executerTask, descTask, statusTask.getTitle());
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || !(o instanceof Task)) {
            return false;
        }
        return ((Task) o).getIdTask().equals(this.idTask);
    }

    public String toStringDataTask() {
        return String.format("ID:%d, название:%s, владелец:%s, имя исполнителя:%s, описание:%s, статуc:%s",
                idTask, nameTask, ownerTask, executerTask, descTask, statusTask);
    }
}
