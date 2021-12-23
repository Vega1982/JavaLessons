package main.java.Lesson16;



public class Logger {
    public String MESSAGE;

    public String getMESSAGE() {
        return MESSAGE;
    }

    public void setMESSAGE(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    public static void main(String[] args) throws InterruptedException {
        MyFirstThread thread1 = new MyFirstThread();
        FirstThread(thread1, thread1.getGotSleepTime());


    }

    public static synchronized void FirstThread(Thread thread, long sleepTime) throws InterruptedException {
//        thread.wait();
        thread.start();
//        thread.notify();
    }


}

