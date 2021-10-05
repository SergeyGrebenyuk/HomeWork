package ru.geekbrains.jca.home11;

import java.util.ArrayList;
import java.util.List;

class Box<T extends Fruit> {

    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public Box() {
        list = new ArrayList<T>();
    }

    void add(T obj) {
        list.add(obj);
    }

    void moveAt(Box<T> box) {
       this.list.addAll(box.list);
        box.list.clear();
    }

    void info(String nameBox, Float weight) {
        if (list.isEmpty()) {
            System.out.println("Коробка " + nameBox+" пуста");
        } else {
            System.out.println("В коробке "+ nameBox + list.size() +" шт." +"весом " + weight);
        }
    }

    float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }

    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

}