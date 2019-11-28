package com.geekbrains.training.homework.spring.exception;

import java.io.IOException;

public class TaskBDException extends IOException {
    public TaskBDException(String text) {
        super(text);
    }
}
