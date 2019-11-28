package com.geekbrains.training.homework.spring.exception;

public class FullTaskArrayListException extends ArrayIndexOutOfBoundsException {
    public FullTaskArrayListException() {
        super("Система не смогла добавить задачу в список.");
    }
}
