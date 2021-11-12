package main.java.Lesson4;

import java.util.Scanner;

import static java.lang.Math.pow;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите целое положительное число n для расчёта его квадратного корня: ");

        // задаём начальную переменную
        // получаем от пользователя число, для которого будем вычислять кв. корень
        double inRoot = console.nextInt();
        int resultRoot = 1;

        // цикл подсчёта квадратного корня
        while (pow(resultRoot, 2) < inRoot) {
            resultRoot++;
            if (pow(resultRoot, 2) == inRoot) {
                System.out.println("Корень числа " + inRoot + "=" + resultRoot);
                break;
            }
        }

    }


}



