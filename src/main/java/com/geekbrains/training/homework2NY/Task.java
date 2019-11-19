package com.geekbrains.training.homework2NY;

public class Task {
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

    private Long idTask;
    private String nameTask;
    private String ownerTask;
    private String executerTask;
    private String descTask;
    private StatusTask statusTask;

    public Task(Long idTask, String nameTask, String ownerTask, String executerTask, String descTask, StatusTask statusTask) {
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

    public StatusTask getStatusTask() {
        return statusTask;
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
        ;
        return ((Task) o).getIdTask().equals(this.idTask);
    }

    public String toStringDataTask() {
        return String.format("ID:%d, название:%s, владелец:%s, имя исполнителя:%s, описание:%s, статуc:%s",
                idTask, nameTask, ownerTask, executerTask, descTask, statusTask);
    }
}
