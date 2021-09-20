package ru.geekbrains.jca.home7;

import java.util.Scanner;

public class Bowl {
    protected int amountFood;
    public static Scanner sc = new Scanner(System.in);

    public Bowl(int amountFood) {
        this.amountFood = amountFood;
    }

    public void info(){
        System.out.printf("Количество еды в тарелке: %d \n",amountFood);
    }

    public void decreaseFood(int n) {
        amountFood -= n;
    }

    public void addFood (){
        setAmountFood(amountFood+sc.nextInt());
    }

    public void setAmountFood(int amountFood) {
        if (amountFood >= 0) {
            this.amountFood = amountFood;
        } else System.out.println("Нельзя съесть больше, чем есть в тарелке");
    }
}

