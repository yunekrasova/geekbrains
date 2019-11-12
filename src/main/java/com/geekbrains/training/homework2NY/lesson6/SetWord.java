package com.geekbrains.training.homework2NY.lesson6;

import java.util.*;

public class SetWord {

    public static void main(String[] args) {
        String[] arrWorld = {"Дом", "Магазин", "Театр", "Дом", "Филармония", "Театр","Дом", "Магазин", "Театр", "Дом", "Филармония", "Театр","Дом", "Магазин", "Театр", "Дом", "Филармония", "Театр"};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i<arrWorld.length; i++)
        {
            map.put(arrWorld[i], map.getOrDefault(arrWorld[i],0)+1);
        }

        for ( Map.Entry<String, Integer> iter : map.entrySet() )
        {
            System.out.println("Слово ["+iter.getKey()+"] встречается "+iter.getValue()+" раз.");
        }
    }

}
