package com.geekbrains.training.homework.spring.exception;

public class NoUniqueException extends IllegalArgumentException {
    public NoUniqueException(Long ID) {
        super("ID=" + ID + " не уникальный ");
    }
}
