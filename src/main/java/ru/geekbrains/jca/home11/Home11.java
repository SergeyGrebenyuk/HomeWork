package ru.geekbrains.jca.home11;

import java.util.Arrays;
import java.util.List;

public class Home11 {
    public static void main(String[] args) {

        // Задание п.1
        String[] arr = {"один", "два", "три", "четыре","пять"};
        System.out.println("Задание 1");
        System.out.println("Оригинальный массив:\n" + Arrays.toString(arr));
        swapArrElem(arr, 2, 4);
        System.out.println("Измененный массив:\n" + Arrays.toString(arr));
        System.out.println();


        //Задача п.2
        List<String> newArr = convertArrList(arr);
        System.out.println("Задания 2\n" + "Новый массив: " + newArr.getClass() + " : " + newArr);
        System.out.println();

        //Задача 3. коробки
        System.out.println("Задание 3");

        Box<Orange> sortBox = new Box();
        Box<Orange> orangeBox = new Box();
        Box<Apple> appleBox = new Box();

        for (int i = 0; i < 4; i++) {
            orangeBox.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }

        Float sortBoxWeight = orangeBox.getWeight();
        Float orangeWeigth = orangeBox.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Взвешивание перед сменной коробки: ");

        System.out.println();

        sortBox.info("cортировочная ",sortBoxWeight);
        orangeBox.info("c апельсинами ",orangeWeigth);
        appleBox.info("c яблоками ",appleWeigth);

        System.out.println();

        System.out.println("Сравниваем вес сортировочной коробки и коробки с яблоками: \n" + sortBox.compare(appleBox));
        System.out.println("Сравниваем вес коробки с апельсинами и коробки с яблоками: \n" + orangeBox.compare(appleBox));

        System.out.println();

        sortBox.moveAt(orangeBox);
        /*orangeBox.moveAt(appleBox); /*Ошибка, нельзя в коробку с одним видом фруктов,
                                      высыпать содержимое коробки с другим видом фруктов*/

        System.out.println("Взвешивание после смены коробки: ");

        System.out.println();

        sortBox.info("cортировочная ",sortBoxWeight);
        orangeBox.info("c апельсинами ",orangeWeigth);
        appleBox.info("c яблоками ",appleWeigth);

       sortBox.getWeight();
       orangeBox.getWeight();
       appleBox.getWeight();

        System.out.println();

        sortBox.compare(appleBox);
        System.out.println("Сравниваем вес сортировочной коробки и коробки с яблоками: \n" + sortBox.compare(appleBox));
        System.out.println("Сравниваем вес коробки с апельсинами и коробки с яблоками: \n" + orangeBox.compare(appleBox));
    }

    private static <T> void swapArrElem(T[] array, int ind1, int ind2) {
        T t = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = t;
    }

    private static <A> List<A> convertArrList(A[] array) {
        return Arrays.asList(array);
    }
}

