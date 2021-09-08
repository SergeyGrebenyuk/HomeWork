package ru.geekbrains.jca.home4;

public class homeFour {
    public static char[][] map;
    public static final int size= 3;
    public static final int DOTS_TO_WIN = 3;

    public static void main() {
        gameMap();
        printGameMap();

    }

    public static void gameMap() {
        map=new char[size][size];
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                map[i][j]='*';
            }
        }
    }

    public static void printGameMap() {
        for (int i = 0; i < size - 1; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size - 1; j++) {
                System.out.print(map[i][j] + "|");
                System.out.print("___");
            }
            System.out.println();
        }
    }

}
