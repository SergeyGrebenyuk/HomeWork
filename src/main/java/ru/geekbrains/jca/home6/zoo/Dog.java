package ru.geekbrains.jca.home6.zoo;

public class Dog extends Animal {
    private static int count;
    public Dog(String name, String color, String type, int run, int obstacleRun, int swim, int obstacleSwim) {
        super(name, color, type, run, obstacleRun, swim, obstacleSwim);
        count++;
    }
    public static int getCount() {
        return count;
    }
}