package com.geekbrains.training.homework2NY.lesson4;

public class MyArrayDataException extends NumberFormatException  {

    public MyArrayDataException(int Width, int Height){
    super("Элемент массива ["+Width+"] ["+Height+"] не верный");
    }
}
