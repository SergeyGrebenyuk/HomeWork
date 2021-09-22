package ru.geekbrains.jca.home8;

public class Human implements Participants {
    private String name;
    private int distanceRun;
    private int heightJump;

    public Human(){

    }
    public Human(String name) {
        this();
        this.name = name;
    }

    public Human(String name, int distanceRun, int heightJump) {
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
