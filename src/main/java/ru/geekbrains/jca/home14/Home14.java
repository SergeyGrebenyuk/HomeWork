package ru.geekbrains.jca.home14;

public class Home14 {

    public static void main(String[] args) {
        int[] arr  = {1,2,4,4,2,3,4,1,7};
        int[] arr1 = {1,1,1,4,4,1,4,4};
        int[] arr2 = {1,1,1,1,1,1,1,1};
        int[] arr3 = {4,4,4,4,4,4,4,4};
        int[] arr4 = {3,1,4,4,1,1,4,3};
        checkArray(arr);
        checkArray(arr1);
        checkArray(arr2);
        checkArray(arr3);
        checkArray(arr4);
        System.out.println("В массиве есть 1 и 4 : " + checkArray2(arr1));
        System.out.println("В массиве есть 1 и 4 : " + checkArray2(arr2));
        System.out.println("В массиве есть 1 и 4 : " + checkArray2(arr3));
        System.out.println("В массиве есть 1 и 4 : " + checkArray2(arr4));

    }

    public static void checkArray(int[] arr) {
        int x = 0;
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i] == 4) {
                x = arr[i];
                int [] result = new int[arr.length - i - 1];
                for (int j = i + 1, k = 0; j < arr.length; j++, k++) {
                    result[k] = arr[j];
                }
                print(result);

                break;
            }
        }
        exception(x);
    }

    private static void print(int[] result) {
        System.out.print("Итоговый массив: ");
        if (result.length==0) System.out.print(" Массив пуст ");
        for (int i = 0; i< result.length; i++) System.out.print(result[i] + " ");
        System.out.println("");
    }

    private static void exception(int x) {
        try{
            x = 1 / x;
        } catch(ArithmeticException e){
            System.out.println("В массиве нет ни одной 4-ки");
        }

    }

    public static boolean checkArray2(int[] arr){
        int one=0;
        int four=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 1 && arr[i] != 4) return false;
            else if (arr[i]==1) one++;
            else four++;
        }
        if(one==0 || four==0) return false;
        return true;

    }
}
