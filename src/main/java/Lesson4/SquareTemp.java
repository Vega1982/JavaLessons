package main.java.Lesson4;

import java.util.Scanner;

import static java.lang.Math.pow;

public class SquareTemp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите целое положительное число n для расчёта его квадратного корня: ");

        // задаём начальную переменную
        // получаем от пользователя число, для которого будем вычислять кв. корень
        int inRoot = console.nextInt();
        int resultRoot = 1;
        // цикл подсчёта квадратного корня
        for (; (resultRoot < inRoot); ++resultRoot) {

            if (inRoot == 0) {
                System.out.println("Нет корней для нуля");
                break;
            }

            if ((resultRoot * resultRoot) == inRoot) {
                System.out.println("Корень числа " + inRoot + " = " + resultRoot);

            }

        }
    }

}



/*
while (pow(resultRoot, 2) < inRoot) {
            resultRoot++;
            if (pow(resultRoot, 2) == inRoot) {
                System.out.println("Корень числа " + inRoot + "=" + resultRoot);
                break;
            }
 */
