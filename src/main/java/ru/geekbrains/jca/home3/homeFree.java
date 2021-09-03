package ru.geekbrains.jca.home3;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homeFree {
    public static void main(String[] args) {
      //  fillSquareArrayDiagonally(10);          //Ответ на 1.п задания
      //  guessNumber();
        guessWord();

    }
    //метод для распечатки массива
    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //static int randomNumber() {


  /*  1п. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/
    public static void fillSquareArrayDiagonally(int size) {
        int[][] arr = new int[size][size];
        for (int i=0; i<size;i++){
            arr[i][i] = 1;                      //заполняем по диагонали слева на право
            arr[i][arr.length-1 - i] = 1;       //заполняем по диагонали с права на лево

        }
        printArr(arr);                          //выводим массив в консоль
    }


    /*Написать программу, которая загадывает случайное число от 0 до 9 и пользователю
     дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить,
     больше ли указанное пользователем число, чем загаданное, или меньше. После победы
     или проигрыша выводится запрос –
     «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/
    public static void guessNumber() {
        int answer=0;
        int hiddenNumber=0;
        int repeat = 1;
        Scanner sc = new Scanner(System.in);
        do {
                System.out.println("Угадайте число от 0 до 9. Вам дается 3 попытки");
                hiddenNumber = (int) (Math.random() * 9);
            for (int i = 1; i <=3; i++) {
                    System.out.println("Введите число:");
                    answer = sc.nextInt();
                if (answer == hiddenNumber) {
                    System.out.println("Поздравляю! Вы угадали");
                    break;
                } else if (answer > hiddenNumber) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                }
            }
            System.out.println(answer);
            if (answer!= hiddenNumber) {
                System.out.println("Вы использовали все попытки!!!");
            }
            System.out.println("Повторить игру еще раз? Да-1, Нет - 0");
            repeat = sc.nextInt();
        } while (repeat==1);
        System.out.println("GAME OVER");
        sc.close();
    }

    /* **Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
       "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
       "olive", "pea", "peanut", "pear", "pepper", "pineapple","pumpkin", "potato"}.
        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным
        словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые
        стоят на своих местах. apple – загаданное apricot - ответ игрока ap############# (15 символов, чтобы
        пользователь не мог узнать длину слова) Для сравнения двух слов посимвольно можно пользоваться:
        String str = "apple"; char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        Играем до тех пор, пока игрок не отгадает слово. Используем только маленькие буквы.*/
    public static void guessWord() {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        String[] guessedLetters = new String[15];
        Random rnd= new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple","pumpkin", "potato"};
        for (i = 0; i < 15; i++) {                          //Заполняем проверочное слово символом #
            guessedLetters[i] = "#";
        }
        int randomIndex = rnd.nextInt(words.length);    //загадываем слово
        System.out.println(words[randomIndex]);         //выводим загаданное слово
        System.out.println(Arrays.toString(guessedLetters));
        String answer = sc.nextLine();
        for (i = 0; i < words.length; i++) {
            if (words[i].equals(answer)) {
                System.out.println("Угадал");
                break;
            }



        }


    }

}
