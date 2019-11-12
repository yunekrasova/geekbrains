package com.geekbrains.training.homework2NY.lesson6;

import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class PhoneBook {
    Map<String, Set<String>> dataPhone;

    public PhoneBook() {
        dataPhone = new HashMap<>();
    }

    public void add(String name, String phone) {
        if (!dataPhone.containsKey(name)) {
            dataPhone.put(name, new HashSet<>());
        }
        dataPhone.get(name).add(phone);
    }

    public Set<String> get(String name) {
        return dataPhone.get(name);
    }
}
