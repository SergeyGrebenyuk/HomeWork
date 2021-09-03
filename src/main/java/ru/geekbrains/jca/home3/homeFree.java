package ru.geekbrains.jca.home3;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homeFree {
    public static void main(String[] args) {

      fillSquareArrayDiagonally(10);          //Ответ на 1.п задания
      guessNumber();                               //Ответ на 2.п задания
      guessWord();                                 //Ответ на 3.п задания

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


    /* 2п. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю
     дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить,
     больше ли указанное пользователем число, чем загаданное, или меньше. После победы
     или проигрыша выводится запрос –
     «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/
    public static void guessNumber() {
        int answer=0;
        int hiddenNumber;
        int repeat;
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
    }

    /* 3п. **Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
       "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
       "olive", "pea", "peanut", "pear", "pepper", "pineapple","pumpkin", "potato"}.
        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным
        словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые
        стоят на своих местах. apple – загаданное apricot - ответ игрока ap############# (15 символов, чтобы
        пользователь не мог узнать длину слова) Для сравнения двух слов посимвольно можно пользоваться:
        String str = "apple"; char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        Играем до тех пор, пока игрок не отгадает слово. Используем только маленькие буквы.*/

    public static void guessWord() {
        int i;
        int j=0;
        Scanner wc = new Scanner(System.in);
        Random rnd= new Random();
        String answerUser;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple","pumpkin", "potato"};

        char[] hint= new char[15];
        for (i = 0; i < 15; i++) {                          //Заполняем подсказку символом #
            hint[i] = '#';
        }

        int randomIndex = rnd.nextInt(words.length);         //определяем случайным образом индекс загаданного слова
        String wordGuess=words[randomIndex];                 //загаданное слово

        System.out.println(wordGuess);                      //печатаем загаданное слово

        System.out.println("Я загадал слово из следующего списка {\n" +Arrays.toString(words) +"\n" + "} попробуй отгадай его");
        System.out.println("Подумай хорошо и напиши свой вариант: ");

        while (true) {
            answerUser = wc.nextLine();                         //Ждем ответ от игрока
            if (answerUser.toLowerCase().equals(wordGuess)) {
                System.out.println("Вы угадали!!!");
                break;
            }
            for (i = 0; i < answerUser.length() && i < wordGuess.length(); i++) {    // определяем совпадающие буквы
                if (answerUser.charAt(i) == wordGuess.charAt(i)) {
                    hint[i] = answerUser.charAt(i);
                    j=j+1; //счетчик угаданных букв
                }
            }
            if (j!=0) {
                System.out.println("У тебя почти получилось, ты угадал несколько букв правильно.\n"
                        + "Подумай еще и у тебя все получится:");
                System.out.println(Arrays.toString(hint));
            }
            System.out.println("Твой ответ не верен. Сосредоточься! Это так просто!!!");
            }
        }
    }


