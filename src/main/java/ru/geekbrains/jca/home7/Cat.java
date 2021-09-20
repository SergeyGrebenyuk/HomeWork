package ru.geekbrains.jca.home7;

public class Cat {
    protected int appetite;
    protected String name;
    protected boolean satiety;


    public Cat(String name, int appetite){
        this.appetite=appetite;
        this.name=name;
    }

    public void eat(Bowl bowl) {
        while (bowl.amountFood < appetite){
            System.out.printf("Кот %s не будет есть из пустой тарелки\n он должен съесть %d еды \n Добавьте еды в тарелку >>>",name, appetite);
            bowl.addFood();
        }
        bowl.decreaseFood(appetite);
        satiety=true;
        System.out.printf("Кот %s сытый %b \n",name, satiety);
    }
}

