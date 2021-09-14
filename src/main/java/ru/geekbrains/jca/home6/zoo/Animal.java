package ru.geekbrains.jca.home6.zoo;

import static java.lang.Math.abs;

public abstract class Animal{
    protected String type;
    protected String name;
    protected String color;
    protected int run;
    protected int swim;
    protected int obstacleRun;
    protected int obstacleSwim;
    private static int count;

    public Animal() {
        count++;
    }

    public Animal(String type, String name, String color, int run, int obstacleRun, int swim, int obstacleSwim) {
        this();
        this.type = type;
        this.name = name;
        this.color = color;
        this.run=run;
        this.obstacleRun = obstacleRun;
        this.swim=swim;
        this.obstacleSwim=obstacleSwim;
    }

    public void run() {
        if (run<=obstacleRun)
        System.out.printf("%s %s %s пробежала через лес %d м.\n",type, name, color, run);
        else System.out.printf("%s %s %s не до бежала до опушки леса %d м.\n",type, name, color, abs(obstacleRun-run));
    }
    public void swim(){
        if (swim<=obstacleSwim)
            System.out.printf("и проплыла через реку %d м.\n", swim);
        else System.out.printf("%s %s %s не до плыла до берега  %d м. и вернулась обратно!\n",
                type, name, color, abs(obstacleSwim-swim));
    }

    public static int getCount() {
        return count;
    }
}