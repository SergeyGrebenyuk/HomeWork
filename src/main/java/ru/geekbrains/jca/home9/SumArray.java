package ru.geekbrains.jca.home9;

public class SumArray {

    public static int arrDebug(String[][] arrString) {
        int sumArr = 0;
        int lengthArr = 4;
        int[][] arrInt = new int[4][4];

        if (arrString.length != lengthArr) throw new MyArraySizeException("Не верный размер массива");

        for (int i = 0; i < lengthArr; i++) {
            if (arrString[i].length != lengthArr) throw new MyArraySizeException("Не верный размер массива");
            for (int j = 0; j < lengthArr; j++) {
                try {
                    arrInt[i][j] = Integer.parseInt(arrString[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Значение '%s' в ячейке массива arrString[%d][%d],\n" +
                            " не может быть конвертирован в целое число\n",arrString[i][j], i, j));
                }
                sumArr += arrInt[i][j];
            }
        }
        System.out.println(" Sum:" + sumArr + " ");
        return sumArr;
    }
}
