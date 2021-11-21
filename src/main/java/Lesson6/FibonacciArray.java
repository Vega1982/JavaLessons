package main.java.Lesson6;

import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {
// запрашиваем переменную n для расчёта числа Фибоначчи
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое положительное число индекса n");
        System.out.print("для расчёта значения его числа Фибоначчи: ");
        int n = console.nextInt();

        // Проверяем n на корректность (программа считает числа Фибоначчи
        // только для 0 <= n <= 91, т.к. большие значения не помещаются в тип long
        for (; n < 0 || n > 91; ) {
            System.out.print("Введите целое положительное число менее 92: ");
            n = console.nextInt();
        }


        // создаём массив на 93 элементов
        long[] fibArray = new long[92];

        // Наполняем созданный массив числами Фибонначи с помощью вызова метода
        for (int step = 1; step <= 92; step++) {
            fibArray[step - 1] = fibonacciCalculate(step);
            //System.out.println("Индекс: " + (step - 1) + " равен " + fibArray[step - 1]);

        }
        // Проверяем n. Если <=1 n <=50, то возвращаем соответствующее ему число Фибоначчи из массива.
        // Если 50 < n < 91, то вычсляем соответствующее ему число Фибоначчи через метод и выводим на экран.
        if (n > 50 & n < 91) {
            long step = n;
            System.out.println("Для числа n = " + n + " число Фибоначчи = " + fibonacciCalculate(step));

        } else {
            System.out.println("Для числа n = " + n + " число Фибоначчи = " + fibArray[n]);
        }
    }

    /**
     * @param step индекс массива, он же шаг цикла выше
     * @return число Фибоначчи для заданного n
     */
    public static long fibonacciCalculate(long step) {
        long fN = 0;
        // Проверки для n == 1; 2; 3
        if (step == 1) {
            fN = 0;
            return fN;

        }

        if (step == 2) {
            fN = 1;
            return fN;
        }

        if (step == 3) {
            fN = 1;
            return fN;
        }

        //Основной цикл расчётов
        for (long fN2 = 0, fN1 = 1, slipperyN = 3; slipperyN <= step; slipperyN++) {
            fN = fN1 + fN2;
            fN2 = fN1;
            fN1 = fN;

            //Проверка для выхода из цикла и программы
            if (slipperyN == step) {
                return fN;
            }
        }
        return fN;
    }
}
