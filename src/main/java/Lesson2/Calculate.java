package main.java.Lesson2;

public class Calculate {
    public static void main(String[] args) {
        System.out.println("Рассчёты");

        long summa = summ(35, 7);
        System.out.println("Сумма чисел 35 и 7 = " + summa);

        long subtraction = minus(35, 7);
        System.out.println("Разность чисел 35 и 7 = " +subtraction);

        long multi = multiplication(35, 7);
        System.out.println("Умножение чисел 35 и 7 = " +multi);

        double div = division(35, 7);
        System.out.println("Деление чисел 35 и 7 = " +div);

    }
    public static long summ(long arg1, long arg2) {
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
}
