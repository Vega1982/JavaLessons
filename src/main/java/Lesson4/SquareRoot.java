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

        for(int resultRoot = 1; resultRoot == pow(inRoot, 2); resultRoot++)
        {
//            if (-inRoot > 0) {
//                System.out.println("Нет корней для отрицательного числа " + inRoot);
//                break;
//            }
//
//            if (nRoot == 0) {
//                System.out.println("Нет корней для нуля.");
//                break;
//            }
//            if (nRoot % 2 > 0) {
//                System.out.println("Квадратный корень числа " + nRoot + " равен " + resultRoot);
//                break;
//            }
            System.out.println("Корень числа " + inRoot + "=" + resultRoot);

        }

    }

    //public static double power(double inRoot) {
        //double resultPow = pow(inRoot, 2);
        //return resultPow;
    }

}

