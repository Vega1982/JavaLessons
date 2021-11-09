package main.java.Lesson3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число n для расчёта его факториала: ");

        // задаём начальные переменные
        // получаем от пользователя число, для которого будем вычислять факториал
        int nFactorialLenght = console.nextInt();
        // переменная шага цикла равна 0 в начале
        long step = 0;
        // переменная факториала равна 1 в начале
        long factorial = 1;

        //цикл расчёта факториала
        while (step < nFactorialLenght) {
            // расчёты
        step++;
        factorial = fac(step, factorial);
        }
        // вывод в консоль переменной factorial
        System.out.println("Факториал числа: " + nFactorialLenght + " равен " + factorial);
    }

    /**
     * @param step шаг цикла
     * @param factorial значение факториала, вычисленное на предыдущем шаге или начальное
     * @return вычисленный факториал
     */
    public static long fac(long step, long factorial) {
        long factor = step * factorial;
        return factor;
    }
}
