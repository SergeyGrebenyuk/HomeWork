package ru.geekbrains.jca.home8;

public class Treadmill implements Obstacle{
    private int length;

    public Treadmill(){
    }

    public Treadmill(int length) {
        this();
        this.length = length;
    }

    @Override
    public boolean overcoming (Participants participant) {
        if (participant.run(this.length)){
            System.out.printf("Участник %s пробежал дистанцию: %d \n", participant.getName(), length);
            return true;
        }
        System.out.printf("Участник %s не смог пробежать дистанцию: %d \n", participant.getName(), length);
        return false;
    }

}
