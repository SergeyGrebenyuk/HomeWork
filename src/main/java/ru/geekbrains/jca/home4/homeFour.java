package ru.geekbrains.jca.home4;

import java.util.Random;
import java.util.Scanner;

public class homeFour {
    public static char[][] map;                         // игровое поле
    public static final int size= 4;                    // размер игрового поля
    public static final int DOTS_TO_WIN = 4;            //количественно выигрышных фишек
    public static Scanner sc = new Scanner(System.in);
    public static Random rnd= new Random();

    public static void main(String[] args) {
        gameMap();                              //создаем карту игры
        printGameMap();                         //печатаем карту игры
        while (true) {
            human();                            //ход человека
            if (checkWin('x')) break;        //проверяем на выигрыш после хода человека

            if(mapFull()==true) {
               System.out.println("Ничья");
               printGameMap();
               break;
           }
            AI();                               //ход компьютера
            if (checkWin('0')) break;       //проверяем ни выигрыш после хода компьютера

            if(mapFull()==true) {
                System.out.println("Ничья");
                printGameMap();
                break;
            }
        }
    }
    public static void gameMap() {               //создаем игровое поле
        map=new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j]='*';
            }
        }
    }

    public static void printGameMap() {         // Вывод на экран игрового поля
        for (int i=1;i<=size;i++){
            System.out.print("   " +i+ " " );
        }
        System.out.println(" ");
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " | ");

            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " | " );
            }
            System.out.println();
            for (int n=1;n<=size;n++){
                System.out.print("_____" );
            }
            System.out.println();
        }
    }

    public static boolean mapFull() {                   //проверки заполненности игрового поля
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j]=='*') return false;
            }
        }
        return true;
    }

    public static void human() {                        // Ход человека
        int humX, humY;
        System.out.println("Введите координаты:   ");
        do{
            humX = sc.nextInt();
            humY = sc.nextInt();
            if (map[humY - 1][humX - 1] != '*') System.out.println("Клетка занята! Повторите ввод координат:    ");
        }while (map[humY - 1][humX - 1] != '*');
        map[humY - 1][humX - 1] = 'x';
    }

    public static void AI() {                           // Ход компьютера
        int aiX,aiY;
        do{
            aiX = rnd.nextInt(size);
            aiY = rnd.nextInt(size);
        }while (map[aiX][aiY]!='*');
        map[aiX][aiY]='0';
        printGameMap();
    }
    //проверка на выигрыш общий. Проверка блоками размером равным количеству фишек для победы
    // Для поля 5х5 и 4 фишки, проверяется блоками 4х4 со сдвигом, т.е. будет проведено 4 проверки блоками 4х4
    private static boolean checkWin(char n) {
        int shiftX,shiftY;
        shiftX = map[0].length - DOTS_TO_WIN + 1;
        shiftY = map.length - DOTS_TO_WIN + 1;
        for (int i = 0; i < shiftX; i++) {
            for (int j = 0; j < shiftY; j++) {
                if (checkWinLine(n,i,j) || checkWinDiag(n,i,j)) {
                    if (n == 'x') System.out.println("Победа человека");
                    else System.out.println("Победа компьютера");
                    printGameMap();
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkWinLine(char n,int i, int j) {                    //проверка на выигрыш по линиям
        for (int x = 0; x <DOTS_TO_WIN; x++) {
            int right = 0;
            int down = 0;
            for (int y = 0; y <DOTS_TO_WIN; y++) {
                if (map[x+i][y+j] == n) right += 1;
                if (map[y+j][x+i] == n) down += 1;
            }
            if (right == DOTS_TO_WIN  || down == DOTS_TO_WIN ) return true;
        }
        return false;
    }
    public static boolean checkWinDiag(char n,int i,int j) {                       //проверка на выигрыш по диагоналям
        int rightDiag=0;
        int leftDiag=0;
        for (int y = 0; y < DOTS_TO_WIN; y++) {
            if (map[y+i][y+j] == n) rightDiag += 1;
            if (map[y+i][DOTS_TO_WIN - 1 - y] == n) leftDiag += 1;
        }
        return rightDiag == DOTS_TO_WIN || leftDiag == DOTS_TO_WIN ;
    }
}
