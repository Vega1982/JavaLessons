package Lesson5;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое положительное число индекса n");
        System.out.print("для расчёта значения его числа Фибоначчи: ");
        long n = console.nextInt();
        long fN = 0;

        //n - индекс на входе
        //fN - искомое число Фибоначчи для индекса n
        //slipperyN - скользящий индекс n для промежуточных расчётов
        //fN1 - число Фибоначчи для индекса минус 1 от текущего slipperyN
        //fN2 - число Фибоначчи для индекса минус 2 от текущего slipperyN

        //Программа считает только начиная с n >= 4, поэтому для n == 1...3 значения выдаются без расчётов:
        if (n == 1) {
            fN = 0;
            System.out.println("Число Фибоначчи для n" + n + " равно " + fN);
            return;

        }

        if (n == 2) {
            fN = 1;
            System.out.println("Число Фибоначчи для n" + n + " равно " + fN);
            return;
        }

        if (n == 3) {
            fN = 1;
            System.out.println("Число Фибоначчи для n" + n + " равно " + fN);
            return;
        }

        //Основной цикл расчётов
        for (long fN2 = 0, fN1 = 1, slipperyN = 3; slipperyN <= n; slipperyN++) {
            fN = fN1 + fN2;
            fN2 = fN1;
            fN1 = fN;

            //Проверка для выхода из цикла и программы
            if (slipperyN == n) {
                System.out.println("Число Фибоначчи для n" + n + " равно " + fN);
                return;
            }

        }


    }
}

