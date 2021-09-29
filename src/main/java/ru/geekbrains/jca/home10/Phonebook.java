package ru.geekbrains.jca.home10;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Phonebook {
    private final Map<String, Set<String>> entries = new TreeMap<>();
    public void add(String name, String number){
        Set<String> phones=getPhones(name);
        phones.add(number);
    }
    private Set<String> getPhones(String name) {
        return entries.computeIfAbsent(name, key-> new HashSet<>());
    }
    public Set<String> get(String name) {return getPhones(name);}
}
