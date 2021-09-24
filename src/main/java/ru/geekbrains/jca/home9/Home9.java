package ru.geekbrains.jca.home9;

public class Home9 {
    public static void main(String[] args) {

        String[][] arrString1 = {
                {"11", "12", "13", "14"},
                {"15", "16", "17", "18"},
                {"19", "110", "111", "112"},
                {"113", "114", "115", "116"},
        };
        String[][] arrString2 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "f", "11", "12"},
                {"13", "14", "15", "16"},
        };
        String[][] arrString3 = {
                {"11", "21", "31", "41","45"},
                {"51", "61", "71", "81"},
                {"91", "101", "111", "121"},
                {"131", "141", "151", "161"},
        };
        try {
            SumArray.arrDebug(arrString1);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            SumArray.arrDebug(arrString2);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            SumArray.arrDebug(arrString3);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

