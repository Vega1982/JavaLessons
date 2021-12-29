package main.java.Lesson17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThreadsRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Создадим List и наполним его числами
        List<Integer> list = new ArrayList<>(1000000);
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            list.add(random.nextInt(9999999));
        }




        // Асинхронный вызов трёх потоков с вычислениями
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {

            System.out.println("Максимальное число: " + getMaxInt(list));
            System.out.println("Минимальное число: " + getMinInt(list));
            System.out.println("Среднее значение: " + getAvgDouble(list));
        });

        // Вывод результатов вычислений:
        future.get();

    }

    // Вычислим максимальное число
    public static int getMaxInt(List list) {
        int maxInt;
        maxInt = (int) Collections.max(list);
        return maxInt;
    }

    // Вычислим минимальное число
    public static int getMinInt(List list) {
        int minInt;
        minInt = (int) Collections.min(list);
        return minInt;
    }

    // Вычислим среднее значение
    public static double getAvgDouble(List list) {
        double avgDouble = 0.0;
        Integer[] intsArray = (Integer[]) list.toArray(new Integer[0]);

        int step = 0;
        while (step < intsArray.length) {
            avgDouble += intsArray[step];
            step++;
        }
        avgDouble = avgDouble / intsArray.length;

        return avgDouble;
    }

}
