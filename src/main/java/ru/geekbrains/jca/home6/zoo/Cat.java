package ru.geekbrains.jca.home6.zoo;

public class Cat  extends Animal {
    private static int count;
    public Cat(String name, String color, String type, int run, int obstacleRun, int swim, int obstacleSwim) {
        super(name, color, type, run, obstacleRun, swim, obstacleSwim);
        count++;
    }
    public void catNonSwim() {
        System.out.printf("%s %s %s не умеет плавать и не " +
                "смогла переплыть реку шириной %d м. \n", type, name, color, swim );
    }

    public static int getCount() {
        return count;
    }
}
