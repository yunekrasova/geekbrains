package com.geekbrains.training.homework2NY.exception;

public class NoUniqueException extends IllegalArgumentException {
    public NoUniqueException(Long ID) {
        super("ID=" + ID + " не уникальный ");
    }
}
