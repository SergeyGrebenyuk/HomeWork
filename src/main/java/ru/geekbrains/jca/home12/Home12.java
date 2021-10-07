package ru.geekbrains.jca.home12;

public class Home12 {
    private static final int size = 10000000;
    private static final int half = size/2;

    public static void main(String[] args) {
        calculationMetod1();
        calculationMetod2();

    }

    public static float[] calculation(float[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        return arr;
    }

    public static void calculationMetod1() {
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) arr[i] = 1.0f;
        long a = System.currentTimeMillis();
        calculation(arr);
        System.out.println("Время выполнения расчета в одном потоке " + (System.currentTimeMillis() - a));
    }

    public static void calculationMetod2() {
        float[] arr = new float[size];
        float[] arr1 = new float[half];
        float[] arr2 = new float[half];
            for (int i = 0; i < arr.length; i++) arr[i] = 1.0f;

        long a = System.currentTimeMillis();
            System.arraycopy(arr, 0, arr1, 0, half);
            System.arraycopy(arr, half, arr2, 0, half);

        new Thread() {
            public void run() {
                float[] a1 = calculation(arr1);
                System.arraycopy(a1, 0, arr1, 0, a1.length);
            }
        }.start();

        new Thread() {
            public void run() {
                float[] a2 = calculation(arr2);
                System.arraycopy(a2, 0, arr2, 0, a2.length);
            }
        }.start();

            System.arraycopy(arr1, 0, arr, 0, arr1.length);
            System.arraycopy(arr2, 0, arr, half, arr2.length);
            System.out.println("Время выполнения расчета в двух потоках: " + (System.currentTimeMillis() - a));
   }

}


