package com.geekbrains.tasktracker.entities;

import com.geekbrains.tasktracker.entities.validation.TaskGroup;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "task")
@Data
@NoArgsConstructor
public class Task {
    public enum Status {
        CREATED("Создана", 0),
        ASSIGNED("Назначена", 1),
        INPROGRESS("В работе", 2),
        COMPLETED("Закрыта", 3),
        REJECTED("Отклонена", 10);
        private String russianTitle;
        private int sortOrder;

        public String getRussianTitle() {
            return russianTitle;
        }

        public int getSortOrder() {
            return sortOrder;
        }

        Status(String russianTitle, int sortOrder) {
            this.russianTitle = russianTitle;
            this.sortOrder = sortOrder;
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "taskId")
    @SequenceGenerator(name = "taskId", sequenceName = "taskid", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Size(min=4, max=100, message="Название должно быть не менее 4 символов и не более 100", groups = {TaskGroup.class})
    @Column(name = "caption")
    private String caption;

    @Size(min=1, max=50, message="Описание не более 50 символов", groups = {TaskGroup.class})
    @Column(name = "owner")
    private String owner;

    @Size(min=1, max=50, message="Описание не более 50 символов", groups = {TaskGroup.class})
    @Column(name = "assigned")
    private String assigned;

    @Size(min=0, max=1000, message="Описание не более 1000 символов", groups = {TaskGroup.class})
    @Column(name = "description")
    private String description;

    @Column(name = "status")
    @Enumerated(javax.persistence.EnumType.STRING)
    private Status status;

}
