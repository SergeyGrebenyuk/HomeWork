package ru.geekbrains.jca.home4;

import java.util.Random;
import java.util.Scanner;

public class homeFour {
    public static char[][] map;
    public static final int size= 3;
    public static final int DOTS_TO_WIN = 3;
    public static Scanner sc = new Scanner(System.in);
    public static Random rnd= new Random();


    public static void main(String[] args) {
        gameMap();
        printGameMap();
        human();
        AI();
        gamePlay();
        checkWinLine();
        chekcWinDiag()

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
        int humX,humY;
        System.out.println("Введите координаты:   ");
        humX = sc.nextInt();
        humY = sc.nextInt();
            map[humY-1][humX-1]='x';
       System.out.println(humX + "  " + humY);
        printGameMap();
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
    public static void checkWinLine() {
        int rightX = 0;
        int downX = 0;
        int right0 = 0;
        int down0 = 0;
        for (int x = 0; x < map.length - 1; x++) {
            for (int y = 0; y < map.length - 1; y++) {
                if (map[y][x] == 'x') rightX += 1;
                if (map[y][x] == '0') right0 += 1;
                if (map[x][y] == 'x') downX += 1;
                if (map[x][y] == '0') down0 += 1;
            }
        }
        if (rightX  == 3||downX ==3) System.out.println("Победа игрока");
        else if (right0 == 3||down0) System.out.println("Победа чкомпьютера");
        else System.out.println("Ничья");
    }
    public static void chekcWinDiag() {
        int rightDiagX=0;
        int rightDiag0=0;
        int leftDiagX=0;
        int leftDiag0=0;
        for (int y = 0; y < map.length - 1; y++) {
            if (map[y][y] == 'x') rightDiagX += 1;
            if (map[y][y] == '0') rightDiag0 += 1;
            if (map[y][map.length - 1 - y] == 'x') leftDiagX += 1;
            if (map[y][map.length - 1 - y] == '0') leftDiag0 += 1;

            if (rightDiagX  == 3||leftDiagX ==3) System.out.println("Победа игрока");
            else if (rightDiag0 == 3||leftDiag0) System.out.println("Победа чкомпьютера");
            else System.out.println("Ничья");
        }
    }

    public static void gamePlay() {
        for (int i = 1; i <= 4; i++) {
            human();
            AI();
            checkWinLine();
            chekcWinDiag();
        }
    }

}
