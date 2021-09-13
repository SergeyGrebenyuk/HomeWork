package ru.geekbrains.jca.home5;

public class home5 {

    public static void main(String[] arg) {

       //Задание 1-3
        StaffMember StaffMember1 = new StaffMember("Иванов И.И.", "дворник", "ivanov@mail.ru", "88001234567", 15000, 53);
        System.out.println("Выполнение задания 1-3: ");
        System.out.println(StaffMember1);

        //Задание 4
        StaffMember[] StaffMembers = {
                new StaffMember("Иванов И.И.", "дворник", "ivanov@mail.ru", "88001234567", 15000, 53),
                new StaffMember("Петров П.П.", "грузчик", "petrov@mail.ru", "88002345678", 18000, 35),
                new StaffMember("Сидоров С.С.", "сторож", "sidorov@mail.ru", "88003456789", 20000, 40),
                new StaffMember("Викторов В.В.", "бухгалтер", "viktorov@mail.ru", "88004567891", 25000, 25),
                new StaffMember("Семенов С.С.", "директор", "semenov@mail.ru", "88005789123", 50000, 49)
        };

        //Задание 5
        System.out.println("Выполнение задания 5: ");
        for (StaffMember StaffMember:StaffMembers){
            if (StaffMember.getAge()>=40 ) System.out.println(StaffMember);

        }

    }

}

