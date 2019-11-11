package com.geekbrains.training.homework2NY.exception;

public class FullTaskException extends ArrayIndexOutOfBoundsException {
    public FullTaskException() {
        super("Список задач заполнен.");
    }
}
