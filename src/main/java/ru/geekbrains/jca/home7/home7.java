package ru.geekbrains.jca.home7;

public class home7 {
    public static void main(String[] args) {
        Bowl bowl = new Bowl(49);
        Cat[] cats = {
                new Cat("Бегемот", 50),
                new Cat("Пингвин", 10),
                new Cat("Крокодил", 35)
        };

        for (Cat cat : cats) {
            bowl.info();
            cat.eat(bowl);
        }
        System.out.printf("В тарелке после обеда осталось %d еды", bowl.amountFood);
    }
}
