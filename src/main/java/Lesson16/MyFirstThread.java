package main.java.Lesson16;

import java.util.Random;

public class MyFirstThread extends Thread {
    private long gotSleepTime;


    public MyFirstThread() {

    }

    public long getGotSleepTime() {
        return gotSleepTime;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("1st Thread");

        for (long i = 0; i < 60000; ) {
            gotSleepTime = sleepTime();
            System.out.println("Выполнен поток: " + getName());
            System.out.println("Прошло милисекунд: " + i);

            try {
                sleep(gotSleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i = i + gotSleepTime;
        }


    }

    private static long sleepTime() {
        Random random = new Random();
        long sleepTime = random.nextLong(5000);
        return sleepTime;
    }


}
