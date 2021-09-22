package ru.geekbrains.jca.home8;

public class Cat implements Participants {
    private String name;
    private int distanceRun;
    private int heightJump;

    public Cat(){

    }
    public Cat(String name) {
        this();
        this.name = name;
    }

    public Cat(String name, int distanceRun, int heightJump) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.heightJump = heightJump;
    }
    @Override
    public boolean run(int length) {
        return distanceRun>=length;
    }
    @Override
    public boolean jump(int height) {
        return heightJump>=height;
    }
    @Override
    public String getName() {
        return name;
    }
}
