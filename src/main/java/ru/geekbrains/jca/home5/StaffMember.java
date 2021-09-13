package ru.geekbrains.jca.home5;

public class StaffMember {

    private String fullName;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    StaffMember(String fullName, String post, String email, String phone, int salary, int age){
        this.fullName = fullName;
        this.post = post;
        this.email= email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return String.format("Сотрудник %s, на должности %s, в возрасте %d," +
                " контакты: email: %s, phone: %s, начислена зарплата: %d\n", fullName, post, age, email, phone, salary);
    }
    public int getAge(){
        return age;
    }
}
