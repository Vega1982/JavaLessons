package Lesson3;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        // Получаем с клавиатуры коэффициенты a, b и c
        Scanner console = new Scanner(System.in);
        System.out.print("Введите коэффициент a: ");
        double a = console.nextInt();
        System.out.print("Введите коэффициент b: ");
        double b = console.nextInt();
        System.out.print("Введите коэффициент c: ");
        double c = console.nextInt();

        //Вычисляем корни уровнения
        double root1 = ((-1 * b) + sqrt(getDiscriminant(a, b, c))) / (2 * a);
        double root2 = ((-1 * b) - sqrt(getDiscriminant(a, b, c))) / (2 * a);

        // Проверка, не нулевой ли первый коэффициент
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
            // Если дискриминант = 0, то нет решений
        } else if (getDiscriminant(a, b, c) < 0) {
            System.out.println("Нет действительных решений уравнения");
        }
        // Если корни равны, то выводим только один корень (x1)
        else if (root1 == root2) {
            System.out.println("Корни x1 и x2 равны = " + root1);
            // Если корна различны, то выводим оба корня
        } else {
            System.out.println("Корни x1 и x2 равны = " + root1 + " " + root2);
        }
    }


    /**
     * Подсчитываем дискриминант по формуле a^2 - 4*b*c
     *
     * @param a коэффициент a
     * @param b коэффициент b
     * @param c коэффициент c
     * @return значение дискриминанта
     */
    public static double getDiscriminant(double a, double b, double c) {
        double disc = (b * b) - (4 * a * c);
        return disc;
    }
}

