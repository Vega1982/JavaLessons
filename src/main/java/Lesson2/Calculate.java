package Lesson2;

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

        double theorCos = cosineTheorem(25, 10, 33);
        System.out.println("По теореме косинусов, при b=25; c=10; углу 33, длина стороны a = " + theorCos);

    }

    /**
     * @param arg1 слагаемое
     * @param arg2 слагаемое
     * @return сумма
     */
    public static long sum(long arg1, long arg2) {
        long result = arg1 + arg2;
        return result;
    }

    /**
     * @param arg1 уменьшаемое
     * @param arg2 вычитаемое
     * @return разность
     */
    public static long minus(long arg1, long arg2) {
        long result = arg1 - arg2;
        return result;
    }

    /**
     * @param arg1 умножаемое
     * @param arg2 умножаемое
     * @return произведение
     */
    public static long multiplication(long arg1, long arg2) {
        long result = arg1 * arg2;
        return result;
    }

    /**
     * @param arg1 делимое
     * @param arg2 делитель
     * @return частное
     */
    public static double division(double arg1, double arg2) {
        double result = arg1 / arg2;
        return result;
    }

    /**
     * Теорема косинусов для треугольников. a^2 = b^2 + c^2 - 2bc*cos угла альфа.
     * Для нахождения длины стороны "a", из результата расчёта
     * по формуле необходимо извлечь квадратный корень.
     * @param b длина стороны b
     * @param c длина стороны c
     * @param angle величина угла альфа в градусах
     * @return длина стороны а
     */
    public static double cosineTheorem(double b, double c, double angle) {
        double cosineAngle = cos(angle);
        double subResult = (b * b) + (c * c) - ((2 * b * c) * cosineAngle);
        double result = sqrt(subResult);
        return result;
    }

}
