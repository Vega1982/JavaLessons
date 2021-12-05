package main.java.Lesson10;


import java.util.Scanner;

public class Converter implements Celsius2Fahrenheit, Fahrenheit2Celsius {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите 1, если хотите перевести из Цельсия в Фареншейта,");
        System.out.print("или введите 2, если хотите перевести из Фареншейта в Цельсия: ");
        int s = console.nextInt();
        if (s != 1 & s != 2) {
            return;
        }
        System.out.print("Введите значение градусов, которое хотите сконвертировать: ");

        double degreeIn = console.nextDouble();


        Converter C2F = new Converter();
        Converter F2C = new Converter();

        if (s == 1) {
            C2F.Cel2Fah(degreeIn);
        } else {
            F2C.Fah2Cel(degreeIn);
        }


    }

    double constant5 = 5.0;
    double constant9 = 9.0;
    double constant32 = 32.0;

    @Override
    public void Cel2Fah(double degreeIn) {
//        double constant5 = 5.0;
//        double constant9 = 9.0;
//        double constant32 = 32.0;
        System.out.println("Температура = " + ((degreeIn * (constant9 / constant5)) + constant32) + DegreesNames.FAHRENHEIT.getDegrees());


    }

    @Override
    public void Fah2Cel(double degreeIn) {
//        double constant5 = 5.0;
//        double constant9 = 9.0;
//        double constant32 = 32.0;
        System.out.println("Температура = " + ((degreeIn - constant32) * (constant5 / constant9) + DegreesNames.CELSIUS.getDegrees()));

    }


}

