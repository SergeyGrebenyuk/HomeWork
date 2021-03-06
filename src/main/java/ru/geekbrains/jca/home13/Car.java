package ru.geekbrains.jca.home13;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    private static CountDownLatch countDownLatchReady;
    private static CyclicBarrier startBarrier;
    private static CountDownLatch countDownLatchFinish;


    static {
        countDownLatchReady = Home13.countDownLatchReady;
        startBarrier = Home13.startBarrier;
        countDownLatchFinish = Home13.countDownLatchFinish;
    }

    String getName() {
        return name;
    }
    int getSpeed() {
        return speed;
    }
    Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));

            System.out.println(this.name + " готов");
            countDownLatchReady.countDown();
            startBarrier.await();
        } catch (Exception e)
            {e.printStackTrace();}

        final ArrayList<Stage> stages = race.getStages();
        for (Stage stage : stages) {
            stage.go(this);
        }
        countDownLatchFinish.countDown();
    }
}