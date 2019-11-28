package com.geekbrains.training.homework.spring.exception;

public class FullTaskException extends ArrayIndexOutOfBoundsException {
    public FullTaskException() {
        super("Список задач заполнен.");
    }
}
