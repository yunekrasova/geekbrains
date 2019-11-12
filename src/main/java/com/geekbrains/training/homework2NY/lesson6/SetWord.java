package com.geekbrains.training.homework2NY.lesson6;

import java.util.*;

public class SetWord {

    public static void main(String[] args) {
        String[] arrWorld = {"Дом", "Магазин", "Театр", "Дом", "Филармония", "Театр", "Дом", "Магазин", "Театр", "Дом", "Филармония", "Театр", "Дом", "Магазин", "Театр", "Дом", "Филармония", "Театр"};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arrWorld.length; i++) {
            map.put(arrWorld[i], map.getOrDefault(arrWorld[i], 0) + 1);
        }

        for (Map.Entry<String, Integer> iter : map.entrySet()) {
            System.out.println("Слово [" + iter.getKey() + "] встречается " + iter.getValue() + " раз.");
        }


        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add("Юлия Н", "1234567890");
        myPhoneBook.add("Юлия C", "234567890");
        myPhoneBook.add("Юлия Н", "34567890");
        myPhoneBook.add("Юлия Н", "4567890");
        myPhoneBook.add("Андрей Н", "567890");
        myPhoneBook.add("Андрей Н", "67890");
        myPhoneBook.add("Лена", "7890");
        myPhoneBook.add("Катя", "890");
        myPhoneBook.add("Миша", "90");
        myPhoneBook.add("Миша Н", "0");

        String testName = "Юлия Н";
        System.out.println("Множество телефонов зарегистрированных на имя '" + testName + "': " + myPhoneBook.get(testName));
        testName = "Катя";
        System.out.println("Множество телефонов зарегистрированных на имя '" + testName + "': " + myPhoneBook.get(testName));
        testName = "Миша";
        System.out.println("Множество телефонов зарегистрированных на имя '" + testName + "': " + myPhoneBook.get(testName));
    }

}
