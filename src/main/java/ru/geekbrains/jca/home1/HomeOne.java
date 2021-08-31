package ru.geekbrains.jca.home1;
// 1-й пункт - Создать пустой проект в IntelliJ IDEA и прописать метод main()
public class HomeOne {

    public static void main(String[] args){

        // выполнение метода по 2п. задания
        variableType();

        // выполнение метода по 3п. задания
        System.out.println("Ответ на 3п. = "+expression(2,7,18.141592653589793f,6));

        // выполнение метода по 4п. задания
        System.out.println("Ответ на 4п. = " + sumOne(15,8));

        // выполнение метода по 5п. задания
        integer(6);

        // выполнение метода по 6п. задания
        System.out.println("Ответ на 6п. = " + intBool(-10));

        // выполнение метода по 7п. задания
        name("Sirius");

        // выполнение метода по 8п.* задания
        year(2004);
    }

    // 2п. Создать переменные всех пройденных типов данных и инициализировать их значения.
        public static void variableType() {
        byte byteVar=-128;
        short shortVar=0;
        int  intVar=1_500_000;
        long longVar=2_500_000_000L;
        char charVar='r';
        char charVarCod=53;
        char charVarUcod='\u3234';
        boolean boolVar=false;
        boolean boolVarTwo=11<15;
        double doubleVar=3.1415926535897932384626433832795;
        float floatVar=3.1415926535897932384626433832795f;

        String stringVar=("Тип данных - строка");

        //Выводим все виды тип данных
        System.out.println("В списке ответ на 2п. задания");

        System.out.println("byte = " + byteVar);
        System.out.println("short = " + shortVar);
        System.out.println("int = " + intVar);
        System.out.println("long = " + longVar);
        System.out.println("char = " + charVar);
        System.out.println("char (код) = " + charVarCod);
        System.out.println("char (код U) = " + charVarUcod);
        System.out.println("boolean = " + boolVar);
        System.out.println("boolean 2 = " + boolVarTwo);
        System.out.println("double = " + doubleVar);
        System.out.println("float = " +floatVar);
        System.out.println("String = " + stringVar);

        System.out.println("Выше в списке были перечислены 8 примитивных типов данных и один ссылочный");
    }

    /* 3п. Написать метод вычисляющий выражение a * (b + (c / d))
       и возвращающий результат, где a, b, c, d – аргументы этого метода, имеющие тип float.*/
        public static float expression (float a,float b,float c,float d){
               return (a * (b + (c / d)));
        }

    /* 4п. Написать метод, принимающий на вход два целых числа и проверяющий,
       что их сумма лежит в пределах от 10 до 20 (включительно),
       если да – вернуть true, в противном случае – false.*/
        public static boolean sumOne(int x, int y){
            return ((x+y)>=10&(x+y)<=20);
        }

    /* 5п. Написать метод, которому в качестве параметра передается целое число,
      метод должен напечатать в консоль, положительное ли число передали или отрицательное.
      Замечание: ноль считаем положительным числом. */
        public static void integer(int n) {
            if (n >= 0) {
                System.out.println("Ответ на 5п. = Положительное");
            } else {
                System.out.println("Ответ на 5п. = Отрицательное");
            }
        }

    /* 6п. Написать метод, которому в качестве параметра передается целое число.
       Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/
        public static boolean intBool(int z){
            return (z<0);
        }

    /* 7п. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
       Метод должен вывести в консоль сообщение «Привет, указанное_имя!». */
        public static void name(String name){
            System.out.println("Ответ на 7п. = " + "Привет, " + name);
        }

    /* 8п. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
       Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный. */
        public static void year(int v){
            if(v%4!=0){
                System.out.println("Ответ на 8п.*  задание = " + v + " год - Не високосный");
            }else if ((v%400!=0&v%100==0)){
                System.out.println("Ответ на 8п.*  задание = " + v + " год - Не високосный");
            }else {
                System.out.println("Ответ на 8п.*  задание = " + v + " год - Високосный");
            }
        }
}

