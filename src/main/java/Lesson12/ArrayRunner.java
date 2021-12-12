package main.java.Lesson12;


import java.util.Scanner;


public class ArrayRunner {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        // Запрашиваем размерность массива
        Scanner console = new Scanner(System.in);
        System.out.print("Введите кол-во строк массива: ");
        int i = console.nextInt();
        System.out.print("Введите кол-во столбцов массива: ");
        int j = console.nextInt();

        // Объявляем массив с заданной размерностью
        String[][] array = new String[i][j];

        // Наполняем массив по вводу пользователя
        for (int i1 = 0; i1 < i; i1++) {
            for (int j1 = 0; j1 < i; j1++) {
                System.out.print("ведите число в строку " + i1 + ", столбец " + j1 + ": ");
                array[i1][j1] = console.next();
            }
        }

        // Передаём массив в метод обсчёта и выводим сумму (если нет исключения на неподходящий элемент
        int summ = arraySumm(array);
        System.out.println("Сумма элементов массива: " + summ);
    }

    // метод, в котором выбрасываются исключения и считается сумма элементов массива
    private static int arraySumm(String[][] array) throws MyArrayDataException {
        int i = array.length;
        int j = array[0].length;
        try {
            if (i != 4 || j != 4) {
                throw new MyArraySizeException("Кол-во строк и/или столбцов отлично от 4!");
            }
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());

        }

        int summ = 0;

        for (int iA = 0; iA < i; iA++) {
            for (int jA = 0; jA < i; jA++) {
                if (isNumber(array[iA][jA])) {
                    summ += Integer.parseInt(array[iA][jA]);
                } else {
                    throw new MyArrayDataException("Не число: строка " + iA + " , столбец " + jA);
                }
            }
        }
        return summ;

    }

    // метод, который проверяет, является ли текстовый элемент числом или нет
    private static boolean isNumber(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
