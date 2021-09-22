package ru.geekbrains.jca.home8;

public class Home8 {
    public static void main(String[] args){

        Participants[] participant = {
                new Human("Сергей", 95, 1),
                new Robot("Вертер", 200, 3),
                new Cat("Барбос", 50, 1)
        };

        Obstacle[] obstacles= {
                new Treadmill(55),
                new Wall(2),
        };

       for(Participants p:participant) {
           for(Obstacle o:obstacles) {
               if (!o.overcoming(p)) break;
           }
       }
    }
}
