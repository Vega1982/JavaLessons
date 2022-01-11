package ArmyOfRats;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

import static java.lang.Math.round;

public class RatsRunner {
    public static void main(String[] args) {

        int i = 10000;
        int j = 10000;
        int k = 10000;
        double[] fatRatArray = new double[i];
        double[] piskRatArray = new double[j];
        double[] tailRatArray = new double[k];

        for (int i1 = 0; i1 < i; i1++) {
            fatRatArray[i1] = fatRandom();
        }

        for (int j1 = 0; j1 < j; j1++) {
            piskRatArray[j1] = piskRandom();
        }

        for (int k1 = 0; k1 < k; k1++) {
            tailRatArray[k1] = tailRandom();
        }

        Random wakeUp = new Random();

        Scanner console = new Scanner(System.in);
        System.out.print("Крысы бывают жирны от 100 до 1000 г. Больше или равно какой жирноты берём? ");
        double fatCap = console.nextDouble();
        System.out.print("Крысы пищат от 5 до 100 дБ. Больше или равно какой громкости берём? ");
        double piskCap = console.nextDouble();
        System.out.print("Крысы хвостаты от 10 до 100 см. Больше или равно какого хвоста берём? ");
        double tailCap = console.nextDouble();

        for (int i1 = 0; i1 < i; i1++) {
            if (wakeUp.nextBoolean()) {
                if (HeadFat.headFatDeal(fatRatArray[i1], fatCap) == false) {
                    fatRatArray[i1] = 0.0;
                    //System.out.println("Не берём. Жирнота: " + fatRatArray[i1]);
                } else {
                    //System.out.println("Берём. Жирнота: " + fatRatArray[i1]);
                }
            }

        }

        for (int j1 = 0; j1 < j; j1++) {
            if (wakeUp.nextBoolean()) {
                if (HeadPisk.headPiskDeal(piskRatArray[j1], piskCap) == false) {
                    piskRatArray[j1] = 0.0;
                    //System.out.println("Не берём. Писк: " + piskRatArray[j1]);
                } else {
                    //System.out.println("Берём. Писк: " + piskRatArray[j1]);
                }
            }

        }

        for (int k1 = 0; k1 < k; k1++) {
            if (wakeUp.nextBoolean()) {
                if (HeadTail.headTailDeal(tailRatArray[k1], tailCap) == false) {
                    tailRatArray[k1] = 0.0;
                    //System.out.println("Не берём. Хвост: " + tailRatArray[k1]);
                } else {
                    //System.out.println("Берём. Хвост: " + tailRatArray[k1]);
                }
            }

        }

        int totalRatsCounter = 0;
        for (int i1 = 0; i1 < i; i1++) {
            double fatCheck = fatRatArray[i1];
            double piskCheck = piskRatArray[i1];
            double tailCheck = tailRatArray[i1];
            if(ratsCounter(fatCheck, piskCheck, tailCheck)) {
                totalRatsCounter++;
            }

        }
        System.out.println("В армию зачислено крыс: " + totalRatsCounter);

        double fatTotalWeight = 0.0;
        for (double f:
             fatRatArray) {
            fatTotalWeight = fatTotalWeight + f;
        }
        System.out.println("Общий вес всех крыс: " + round((fatTotalWeight / 1000)) + " кг.");

        double piskTotalVolume = 0.0;
        for (double p:
                piskRatArray) {
            piskTotalVolume = piskTotalVolume + p;
        }
        System.out.println("Общая громкость писка всех крыс: " + round(piskTotalVolume) + " дБ.");

        double tailTotalLength = 0.0;
        for (double t:
                tailRatArray) {
            tailTotalLength = tailTotalLength + t;
        }
        System.out.println("Общая длина хвостов всех крыс: " + round((tailTotalLength) / 100) + " м.");

    }

    public static double fatRandom() {
        double min = 100.0;
        double max = 999.0; //результат будет от 100 до 1000
        return ThreadLocalRandom.current().nextDouble(min, max + 1);
    }

    public static double piskRandom() {
        double min = 5.0;
        double max = 99.0; //результат будет от 5 до 100
        return ThreadLocalRandom.current().nextDouble(min, max + 1);
    }

    public static double tailRandom() {
        double min = 10.0;
        double max = 99.0; //результат будет от 10 до 100
        return ThreadLocalRandom.current().nextDouble(min, max + 1);
    }

    public static boolean ratsCounter(double fat, double pisk, double tail) {
        boolean ratIsInTheArmy = true;
        if (fat == 0.0 || pisk == 0.0 || tail == 0.0) {
            ratIsInTheArmy = false;
        }
        return ratIsInTheArmy;
    }


}
