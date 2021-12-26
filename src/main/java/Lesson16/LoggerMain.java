package main.java.Lesson16;


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;


public class LoggerMain {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(LoggerMain.class));

    public void getLoggerMainDetails() {
    }

    public String TIME = getTime();

    public String getTIME() {
        return TIME;
    }

    public String MESSAGE;

    public String getMESSAGE() {
        return MESSAGE;
    }

    public LoggerMain(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    public void setMESSAGE(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    public static void main(String[] args) throws InterruptedException {

//        logger.error("ERROR");
//        logger.warn("WARNING");
//        logger.fatal("FATAL");
//        logger.debug("DEBUG");
//        logger.info("INFO");


        MyFirstThread thread1 = new MyFirstThread();
        MySecondThread thread2 = new MySecondThread();
        MyThirdThread thread3 = new MyThirdThread();

        // очистка файла
        try (FileWriter writer = new FileWriter("logThread.txt", false)) {
            String text = "";
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Запуск потоков
        threadStarter(thread1);
        threadStarter(thread2);
        threadStarter(thread3);

        // Создаём поток, который ниже ждёт завершения первых трёх потоков, затем активируется и выводит файл на печать
        Printer threadPrinter = new Printer();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadPrinter.start();
    }

    // метод, вкотором запускаются потоки
    public static synchronized void threadStarter(Thread thread) throws InterruptedException {
        thread.join();
        thread.start();
    }


    // Метод для получения текущего времению. Перенесён в классы с потоками
    // фактически неприменимо, т.к. при вызове из другого класса время не меняется
    public static String getTime() {
        return String.valueOf(java.time.LocalDateTime.now());
    }

}

