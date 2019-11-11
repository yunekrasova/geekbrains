package com.geekbrains.training.homework2NY.lesson4;

public class WorkWithArray {

    public WorkWithArray() {
    }

    public int checkWorkWithArray(String[][] Array4x4) {
        int sum = 0;

        if (Array4x4.length != 4 || Array4x4[0].length != 4 || Array4x4[1].length != 4 ||
                Array4x4[2].length != 4 || Array4x4[3].length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < Array4x4.length; i++) {
            for (int j = 0; j < Array4x4[i].length; j++)
                try {
                    sum += Integer.parseInt(Array4x4[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
        }
        return sum;
    }
}
