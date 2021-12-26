package main.java.Lesson16;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class MyThirdThread extends Thread {
    private long gotSleepTime;


    public MyThirdThread() {

    }

    public long getGotSleepTime() {
        return gotSleepTime;
    }

    LoggerMain loggerMain3 = new LoggerMain("Это сообщение 3-го потока");


    @Override
    public void run() {
        Thread.currentThread().setName("3rd Thread");

        // Цикл для вывода информации в файл
        for (long i = 0; i < 60000; ) {
            gotSleepTime = sleepTime(); // переменная для рандомного сна
            //System.out.println("Прошло милисекунд: " + i);
            System.out.println("Статус " + Thread.currentThread().getName() + ": " + Thread.currentThread().getState());
            System.out.println(loggerMain3.getMESSAGE());
            System.out.println("Время: " + getTime());

            // сам вывод в файл
            try (FileWriter writer = new FileWriter("logThread.txt", true)) {
                writer.write("Статус " + Thread.currentThread().getName() + ": " + Thread.currentThread().getState() + " ");
                writer.write(loggerMain3.getMESSAGE() + " ");
                writer.write("Время: " + getTime() + " ");
                //writer.write(text);
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

            try {
                sleep(gotSleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i = i + gotSleepTime;
        }

        // Останавливаем поток:
        Thread.currentThread().interrupt();

    }

    private static long sleepTime() {
        Random random = new Random();
        long sleepTime = random.nextLong(5000);
        return sleepTime;
    }

    // метод для получения времени. При вызове такого же метода из класса Logger время почему-то не меняется
    public static String getTime() {
        return String.valueOf(java.time.LocalDateTime.now());
    }

}
