package com.geekbrains.training.homework2NY;

public class Task {
    private Long idTask;
    private String nameTask;
    private String ownerTask;
    private String executerTask;
    private String descTask;
    private String statusTask;

    public Task(Long idTask, String nameTask, String ownerTask, String executerTask, String descTask, String statusTask) {
        this.idTask = idTask;
        this.nameTask = nameTask;
        this.ownerTask = ownerTask;
        this.executerTask = executerTask;
        this.descTask = descTask;
        this.statusTask = statusTask;
    }

    public Long getIdTask() {
        return idTask;
    }

    public String getNameTask() {
        return nameTask;
    }

    @Override
    public String toString() {
        return String.format("Задача ID:%d, название: %s, имя владельца задачи:%s, имя исполнителя: %s, описание: %s, статуc: %s.",
                idTask, nameTask, ownerTask, executerTask, descTask, statusTask);
    }

    @Override
    public boolean equals(Object o) {

       if (o == null || !(o instanceof Task)) {
            return false;
        } ;
        return ((Task) o).getIdTask().equals(this.idTask);

    }

}
