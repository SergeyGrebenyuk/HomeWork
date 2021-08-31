package ru.geekbrains.jca.home2;

public class homeTwo {

    public static void main(String[] args) {

        replacement(10,2);                           // выполнение метода по 1п. задания
        fillingArray();                                               // выполнение метода по 2п. задания
        multiplicationByTwo();                                        // выполнение метода по 3п. задания
        minMaxArr(10,100);                           // выполнение метода по 4п. задания
        int[] intArr = {1, 5, 7, 2, 11, 4, 5, 2, 1, 2, 6, 28};        // массив для выполнения метода по 5п. задания
        System.out.println("    Массив intArr сбалансирован ="
                + checkBalance(intArr));                              // выполнение метода по 5п. задания
        shiftArr(2,5,10);                       // выполнение метода по 6п. задания


    }
    //метод заполнения массива псевдослучайными числами по заданным параметрам

        public static int[] generationArr(int lenghtArr,int ValuesArr){
            int[] intArr = new int[lenghtArr];
            for (int i = 0; i < intArr.length; i++) {                  //формируем целочисленный массив
                intArr[i] = (int) (Math.random() * ValuesArr);
                System.out.print(intArr[i] + " ");
            }
                return intArr;
        }

        /* 1п. Задать целочисленный массив, состоящий из элементов 0 и 1.
      Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
      С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
        public static void replacement(int lenghtArr,int ValuesArr) {
        System.out.println("Ответ на ЗАДАНИЕ п.1 ");
        System.out.print("     ");
        int[] intArr=generationArr(lenghtArr,ValuesArr);                 //формируем целочисленный массив из 0 и 1
        System.out.println(" ");
        System.out.print("     ");
        for (int i = 0; i < intArr.length; i++) {                  //перебираем элементы массива и заменяем все 0на 1 и все 1 на 0
            if (intArr[i] == 0)
                intArr[i] = 1;
            else intArr[i] = 0;
            System.out.print(intArr[i] + " ");
        }
        System.out.println(" ");
    }

    /* 2п. Задать пустой целочисленный массив размером 8.
      С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/
        public static void fillingArray() {
        int[] intArr = new int[8];
        System.out.println("Ответ на ЗАДАНИЕ п.2 ");
        System.out.print("     ");
        int j = 0;
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = j;
            System.out.print(intArr[i] + " ");
            j += 3;
        }
        System.out.println(" ");
    }

    /* 3п. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        пройти по нему циклом,и числа меньшие 6 умножить на 2;*/
        public static void multiplicationByTwo() {
        int[] intArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Ответ на ЗАДАНИЕ п.3 ");
        System.out.print("     ");
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
        System.out.println(" ");
        System.out.print("     ");
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < 6)
                intArr[i] *= 2;
            System.out.print(intArr[i] + " ");
        }
        System.out.println(" ");
    }

    /* ** 4п. Задать одномерный массив и найти в нем минимальный и
        максимальный элементы (без помощи интернета);*/
        public static void minMaxArr(int lenghtArr,int ValuesArr) {
        System.out.println("Ответ на ЗАДАНИЕ п.4 ");
        System.out.print("     ");
        int[] intArr=generationArr(lenghtArr,ValuesArr);                 //формируем целочисленный массив длиной 10 элементов в диапазоне от 0 до 100
        int max = intArr[0];
        int min = intArr[0];
        System.out.println(" ");
        for (int i = 0; i < intArr.length; i++) {                        //определяем максимальный и минимальный элемент
            if (max < intArr[i])
                max = intArr[i];
            if (min > intArr[i])
                min = intArr[i];
        }
        System.out.println("    Максимальный элемент массива = " + max);
        System.out.println("    Минимальный элемент массива = " + min);
    }

    /* *** 5п. Написать метод, в который передается не пустой, одномерный, целочисленный массив,
           метод должен вернуть true, если в массиве есть место, в котором сумма левой
           и правой части массива равны.
           Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
           граница показана символами ||, эти символы в массив не входят.*/
        public static boolean checkBalance(int[] intArr) {
        System.out.println("Ответ на ЗАДАНИЕ 5п.  ");
        System.out.print("    Заданный массив: ");
        for (int i = 0; i < intArr.length; i++) {                      //выводим заданный массив
            System.out.print(intArr[i] + " ");
        }
            int sumLeft = intArr[0];                                   // переменная суммирования элементов массива слева
            int sumRight = intArr[11];                                 // переменная суммирования элементов массива справа
            int left = 0;                                              // индекс для перебора элементов массива в направлении слева
            int right = 11;                                             // индекс для перебора элементов массива в направлении справа
            System.out.println();
        do {
            if (sumLeft > sumRight) {
                right -= 1;
                sumRight = sumRight + intArr[right];
            }else if (sumLeft < sumRight) {
                left += 1;
                sumLeft = sumLeft + intArr[left];
            }
        } while (left != right && sumLeft != sumRight);
            return (sumLeft == sumRight);
    }

    /* **** 6п. Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
            или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
            Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо)
            -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
            При каком n в какую сторону сдвиг можете выбирать сами.*/
        public static void shiftArr(int offset, int lenghtArr,int ValuesArr) {
        System.out.println("Ответ на ЗАДАНИЕ 6П.");
        System.out.print("    ");
        int[] intArr=generationArr(lenghtArr,ValuesArr);                //формируем массив
        System.out.println();
       for (int j=1;j<=Math.abs(offset);j++) {
            if (offset>0) {                                            //проверяем направление смещения offset>0 - вправо, offset<0 - влево
                int temp = intArr[intArr.length - 1];                  //смещаем в право
                for (int i = intArr.length - 1; i > 0; i--) {
                    intArr[i] = intArr[i - 1];
                }
                intArr[0] = temp;
            }else{
                int temp = intArr[0];                                  //смещаем в лево
                for (int i =0; i < intArr.length - 1; i++) {
                    intArr[i] = intArr[i + 1];
                }
                intArr[intArr.length - 1] = temp;
            }
       }
            System.out.print("   ");
       for (int i = 0; i <=intArr.length-1; i++){               //выводим итоговый массив
            System.out.print(" " + intArr[i]);
        }
    }

}