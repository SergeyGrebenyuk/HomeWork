package ru.geekbrains.jca.home6;

import ru.geekbrains.jca.home6.zoo.*;

import java.util.Random;

public class home6 {

    public static void main(String[] args) {
        int distanceRun=rnd(501)+1;
        int distanceSwim=rnd(20)+1;
        Animal[] animals = {
                new Cat("Кузина", "рыжая","кошка",distanceRun,200,distanceSwim,0),
                new Cat("Машка", "черная","кошка",distanceRun,300,distanceSwim,0),
                new Dog("Шарик", "серый","собака",distanceRun,500,distanceSwim,10),
                new Dog("Тузик", "белый","собака",distanceRun,450,distanceSwim,15)
        };

        for (Animal animal : animals) {
            animal.run();
            if (animal instanceof Cat) ((Cat) animal).catNonSwim();
            else animal.swim();
        }
        System.out.printf("В забеге участвовали %d животных\n", Animal.getCount());
        System.out.printf("В забеге участвовали %d собак\n", Dog.getCount());
        System.out.printf("В забеге участвовали %d котов\n", Cat.getCount());

    }
    public static int rnd(int n){
        Random rnd = new Random();
        return rnd.nextInt(n);
    }

}

