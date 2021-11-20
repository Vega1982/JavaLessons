package main.java.Lesson6;

import java.util.Scanner;

public class ArrayMaxMinAvg {
    public static void main(String[] args) {

        // Запрашиваем длину массива из консоли
        // и присваиваем переменной i для длины массива
        Scanner console = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int i = console.nextInt();

        // Создаём массив длины i и наполняем его случайными значениями от 0 до 1
        double[] array = new double[i];

        for (int step = 0; step < i; step++) {
            array[step] = Math.random();
            System.out.println(array[step]);

        }


        // Вызываем метод для поиска максимального значения в массиве
        System.out.println("--------------------");
        System.out.println("Максимальное число в массиве: " + maxArray(array));

        // Вызываем метод для поиска минимального значения в массиве
        System.out.println("--------------------");
        System.out.println("Минимальное число в массиве: " + minArray(array));

        // Вызываем метод для поиска среднего значения в массиве
        System.out.println("--------------------");
        System.out.println("Среднее число в массиве: " + avgArray(array, i));

    }


    /**
     * Метод поиска максимального значения в массиве
     *
     * @param array Массив
     * @return Максимальное значение
     */
    public static double maxArray(double[] array) {
        double max = array[0];
        int step = 1;
        while (step < array.length) {
            if (max < array[step]) {
                max = array[step];
            }
            step++;
        }
        return max;
    }

    /**
     * Метод поиска минимального значения в массиве
     *
     * @param array Массив
     * @return Минимальное значение
     */

    public static double minArray(double[] array) {
        double min = array[0];
        int step = 1;
        while (step < array.length) {
            if (min > array[step]) {
                min = array[step];
            }
            step++;
        }
        return min;
    }


    /**
     * Метод поиска среднего значения в массиве
     *
     * @param array Массив
     * @param i     Длина массива
     * @return Среднее значение
     */
    public static double avgArray(double[] array, int i) {
        double avg = 0;
        int step = 0;
        while (step < array.length) {
            avg += array[step];
            step++;
        }
        avg = avg / i;
        return avg;
    }

}
