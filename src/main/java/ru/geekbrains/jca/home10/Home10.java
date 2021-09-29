package ru.geekbrains.jca.home10;

import java.util.*;

import static ru.geekbrains.jca.home4.homeFour.map;

public class Home10 {
    public static void main(String[] args) {
       String[] arr={"a","b","c","d","a","b","c","d","q","w","e","q","w","e","b","c","d","q","w","m"};
        System.out.println(arrPrint(arr));
        countDupl(arr);

       Phonebook phonebook=new Phonebook();
            phonebook.add("Петров","8001234567");
            phonebook.add("Васечкин","8001234568");
            phonebook.add("Сыроежкин","8001234569");
            phonebook.add("Сыроежкин","8001234570");
            phonebook.add("Гусев","8001234571");
            phonebook.add("Чижиков","8001234571");
            phonebook.add("Чижиков","8001234572");
            phonebook.add("Чижиков","8001234573");
            phonebook.add("Герасимов","8001234574");

            System.out.println("Номер телефона Петрова: "+phonebook.get("Петров"));
            System.out.println("Номер телефона Васечкина: "+phonebook.get("Васечкин"));
            System.out.println("Номер телефона Сыроежкина: "+phonebook.get("Сыроежкин"));
            System.out.println("Номер телефона Гусева: "+phonebook.get("Гусев"));
            System.out.println("Номер телефона Чижикова: "+phonebook.get("Чижиков"));
            System.out.println("Номер телефона Герасимова: "+phonebook.get("Герасимов"));


    }

    private static TreeSet<String> arrPrint(String[] arr) {
        TreeSet<String> set= new TreeSet<>(Arrays.asList(arr));
        return set;
    }

    private static HashMap<String,Integer> countDupl(String[] arr) {
        HashMap<String,Integer> arrResult = new HashMap<>();
        for (int i = 0; i< arr.length; i++){
            String element = arr[i];
            arrResult .put(element, arrResult .getOrDefault(element,0)+1);
        }
        System.out.println(arrResult );
        return arrResult;
    }
}
