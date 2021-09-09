package ru.geekbrains.jca.home4;

import java.util.Random;
import java.util.Scanner;

public class homeFour {
    public static char[][] map;
    public static final int size= 5;
    public static final int DOTS_TO_WIN = 4;
    public static int humX;
    public static int humY;
    public static int shiftX;
    public static int shiftY;

    public static Scanner sc = new Scanner(System.in);
    public static Random rnd= new Random();


    public static void main(String[] args) {
        gameMap();                              //создаем карту игры
        printGameMap();                         //печатаем карту игры
        while (true) {
            human();                            //ход человека
            if (checkWin('x')) break;        //проверяем ни выигрыш после хода человека
            AI();                               //ход компьютера
            if (checkWin('0')) break;       //проверяем ни выигрыш после хода компьютера
        }do
    }



    public static void gameMap() {
        map=new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j]='*';
            }
        }
    }

    public static void printGameMap() {
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

    public static void human() {
        //int humX, humY;
        System.out.println("Введите координаты:   ");
        do{
            humX = sc.nextInt();
            humY = sc.nextInt();
            if (map[humY - 1][humX - 1] != '*') System.out.println("Клетка занята! Повторите ввод координат:    ");
        }while (map[humY - 1][humX - 1] != '*');
        map[humY - 1][humX - 1] = 'x';
    }

    public static void AI() {
        int aiX,aiY;
        do{
            aiX = rnd.nextInt(size);
            aiY = rnd.nextInt(size);
        }while (map[aiX][aiY]!='*');
        map[aiX][aiY]='0';
        printGameMap();
    }
    private static boolean checkWin(char n) {                       //проверка на выигрыш общий
        if (checkWinLine(n)|| checkWinDiag(n)) {
            if (n=='x') System.out.println("Победа человека");
            else System.out.println("Победа компьютера");
            printGameMap();
            return true;
        }
        return false;
    }

    public static boolean checkWinLine(char n) {                    //проверка на выигрыш по линиям
        for (int x = 0; x < map.length; x++) {
            int right = 0;
            int down = 0;
            for (int y = 0; y < map.length; y++) {
                if (map[x][y] == n) right += 1;
                if (map[y][x] == n) down += 1;
            }
            if (right == DOTS_TO_WIN  || down == DOTS_TO_WIN ) return true;
        }
        return false;
    }
    public static boolean checkWinDiag(char n) {                       //проверка на выигрыш по диагоналям
        int rightDiag=0;
        int leftDiag=0;
        for (int y = 0; y < map.length; y++) {
            if (map[y][y] == n) rightDiag += 1;
            if (map[y][map.length - 1 - y] == n) leftDiag += 1;
        }
        return rightDiag == DOTS_TO_WIN || leftDiag == DOTS_TO_WIN ;
    }
}
