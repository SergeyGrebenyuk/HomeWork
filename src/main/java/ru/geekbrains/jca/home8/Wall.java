package ru.geekbrains.jca.home8;

public class Wall implements Obstacle {
    int height;

    public Wall() {

    }
    public Wall(int height) {
        this();
        this.height = height;
    }
    @Override
    public boolean overcoming (Participants participant) {
        if (participant.jump(this.height)) {
            System.out.printf("Участник %s перепрыгнул стену высотой: %d \n", participant.getName(), height);
            return true;
        }
        System.out.printf("Участник %s не смог перепрыгнуть стену высотой: %d \n", participant.getName(), height);
        return false;
    }
}
