package com.geekbrains.training.homework2NY.exception;

public class FullTaskArrayListException extends ArrayIndexOutOfBoundsException {
    public FullTaskArrayListException() {
        super("Система не смогла добавить задачу в список.");
    }
}
