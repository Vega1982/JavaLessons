package main.java.Lesson16;


import java.io.*;

public class Logger {

    public String TIME = getTime();

    public String getTIME() {
        return TIME;
    }

    public String MESSAGE;

    public String getMESSAGE() {
        return MESSAGE;
    }

    public Logger(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    public void setMESSAGE(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    public static void main(String[] args) throws InterruptedException {
        MyFirstThread thread1 = new MyFirstThread();
        MySecondThread thread2 = new MySecondThread();
        //MyThirdThread thread3 = new MyThirdThread();

        // очистка файла
        try (FileWriter writer = new FileWriter("logThread.txt", false)) {
            String text = "";
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Запуск потоков
        firstThread(thread1);
        firstThread(thread2);
        //firstThread(thread3);

        printFile();

    }

    public static synchronized void firstThread(Thread thread) throws InterruptedException {
        thread.join();
        thread.start();
    }

//    public static synchronized void secondThread(Thread thread) throws InterruptedException {
//        thread.start();
//    }

    // фактически неприменимо, т.к. при вызове из другого класса время не меняется
    public static String getTime() {
        return String.valueOf(java.time.LocalDateTime.now());
    }

    public static void printFile(){
        // Выводим файл в консоль
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("logThread.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (line != null) {
            System.out.println(line);
            try {
                line = in.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

