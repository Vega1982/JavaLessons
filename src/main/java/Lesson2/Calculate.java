package main.java.Lesson2;

import static java.lang.Math.cos;
import static java.lang.Math.sqrt;

public class Calculate {
    public static void main(String[] args) {
        System.out.println("Рассчёты");

        long summa = sum(35, 7);
        System.out.println("Сумма чисел 35 и 7 = " + summa);

        long subtraction = minus(35, 7);
        System.out.println("Разность чисел 35 и 7 = " + subtraction);

        long multi = multiplication(35, 7);
        System.out.println("Умножение чисел 35 и 7 = " + multi);

        double div = division(35, 7);
        System.out.println("Деление чисел 35 и 7 = " + div);

        double teoremaCosinusov = cosinusTeorema(25, 10, 33);
        System.out.println("По теореме косинусов, при b=25; c=10; углу 33, длина стороны a = " + teoremaCosinusov);

    }
    public static long sum(long arg1, long arg2) {
        //Расчёт суммы двух чисел
        long result = arg1 + arg2;
        return result;
    }
    public static long minus(long arg1, long arg2) {
        //Расчёт разности двух чисел
        long result = arg1 - arg2;
        return result;
    }
    public static long multiplication(long arg1, long arg2) {
        //Расчёт умножения двух чисел
        long result = arg1 * arg2;
        return result;
    }
    public static double division(double arg1, double arg2) {
        //Расчёт деления двух чисел
        double result = arg1 / arg2;
        return result;
    }
    public static double cosinusTeorema(double b, double c, double ugol) {
        /* Теорема косинусов. a^2 = b^2 + c^2 - 2bc*cos угла альфа.
        Для нахождения длины стороны "a", из результата расчёта
        по формуле необходимо извлечь квадратный корень */
        double cosinusUgla = cos(ugol);
        double subResult = (b * b) + (c * c) - ((2 * b * c) * cosinusUgla);
        double result = sqrt(subResult);
        return result;
    }

}
