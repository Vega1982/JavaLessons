package main.java.Lesson11;

import java.util.concurrent.ThreadLocalRandom;

public class KppRunner {

    public static void main(String[] args) {
        // Создаём двумерный массив на 40 автомобилей
        final int i = 39;
        final int j = 6;
        double[][] carsArray = new double[i][j];


        // Наполняем массив параметрами типа авто (легковой, грузовой). < 0.5 - легковой, >= 0.5 - грузовой
        for (int line = 0, column = 0; line < i; line++) {
            carsArray[line][column] = carTypeRandom();

        }

        // Наполняем массив номерами авто от 100 до 999
        for (int line = 0, column = 1; line < i; line++) {
            carsArray[line][column] = carNumberRandom();
            // System.out.println((int) carsArray[line][column]);
        }

        // Наполняем массив скоростью авто от 5 до 120 км/ч
        for (int line = 0, column = 2; line < i; line++) {
            carsArray[line][column] = carSpeedRandom();
            // System.out.println(carsArray[line][column]);
        }

        // Наполняем массив весом авто от 1 до 10 тонн
        for (int line = 0, column = 3; line < i; line++) {
            carsArray[line][column] = carWeightRandom();
            //  System.out.println(carsArray[line][column]);
        }

        // Наполняем массив шириной авто от 1 до 3 метров
        for (int line = 0, column = 4; line < i; line++) {
            carsArray[line][column] = carWidthRandom();
            //  System.out.println(carsArray[line][column]);
        }

        // Наполняем массив высотой авто от 1 до 5 метров
        for (int line = 0, column = 5; line < i; line++) {
            carsArray[line][column] = carHeightRandom();
            //  System.out.println(carsArray[line][column]);
        }

        // Эмулируем процесс КПП
        for (int line = 0; line < i; line++) {
            // Присваиваем строковую переменную типа автомобиля
            String carType;
            if (carsArray[line][0] < 0.5) {
                carType = "Легковой";
            } else {
                carType = "Грузовой";
            }
            // Присваиваем переменную номера автомобиля
            int number = (int) carsArray[line][1];

            // Присваиваем переменную скорости автомобиля
            double speed = carsArray[line][2];

            // Присваиваем переменную веса автомобиля
            double weight = carsArray[line][3];

            // Присваиваем переменную ширины автомобиля
            double width = carsArray[line][4];

            // Присваиваем переменную высоты автомобиля
            double height = carsArray[line][5];

            // Проверяем скорость выше 80 км/ч но меньше 100 км/ч
            try {
                if (speed > 80.0 & speed < 100.0) {
                    throw new IllegalArgumentException("Внимание, скорость " + speed + " км/ч.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Проверяем скорость выше 100 км/ч
            try {
                if (speed >= 100.0) {
                    throw new IllegalArgumentException(carType + " автомобиль №" + number + " едет со скоростью " + speed + " км/ч! Полиция выехала на перехват.");

                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Проверяем вес выше 8 т
            try {
                if (weight >= 8.0) {
                    throw new IllegalArgumentException(carType + " автомобиль №" + number + " имеет вес " + weight + " т. Проезд запрещён.");

                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Проверяем высоту выше 4 м
            try {
                if (height >= 4.0) {
                    throw new IllegalArgumentException(carType + " автомобиль №" + number + " имеет высоту " + height + " м. Проезд запрещён.");

                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Проверяем ширину выше 2,5 м
            try {
                if (width >= 2.5) {
                    throw new IllegalArgumentException(carType + " автомобиль №" + number + " имеет ширину " + width + " м. Проезд запрещён.");

                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }


        }


    }

    // Рандомизируем тип автомобилей
    public static double carTypeRandom() {
        return Math.random();
    }

    // Рандомизируем номер автомобиля
    public static double carNumberRandom() {
        double min = 100.0;
        double max = 999.0; //результат будет от 100 до 999
        double number = ThreadLocalRandom.current().nextDouble(min, max);
        return Math.ceil(number);
    }

    // Рандомизируем скорость автомобиля
    public static double carSpeedRandom() {
        double min = 5.0;
        double max = 119.0; //результат будет от 5 до 120
        double speed = ThreadLocalRandom.current().nextDouble(min, max + 1);
        return Math.ceil(speed);
    }

    // Рандомизируем вес автомобиля
    public static double carWeightRandom() {
        double min = 1.0;
        double max = 9.0; //результат будет от 1 до 10
        return ThreadLocalRandom.current().nextDouble(min, max + 1);
    }

    // Рандомизируем ширину автомобиля
    public static double carWidthRandom() {
        double min = 1.0;
        double max = 2.0; //результат будет от 1 до 3
        return ThreadLocalRandom.current().nextDouble(min, max + 1);
    }

    // Рандомизируем высоту автомобиля
    public static double carHeightRandom() {
        double min = 1.0;
        double max = 4.0; //результат будет от 1 до 5
        return ThreadLocalRandom.current().nextDouble(min, max + 1);
    }

}

