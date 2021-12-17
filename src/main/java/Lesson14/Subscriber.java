package main.java.Lesson14;

import java.util.ArrayList;

public class Subscriber {
    private final String FIO;
    private final long telNumber;
    private ArrayList<Long> boundedSubscribers = new ArrayList<Long>();

    public Subscriber(String FIO, Long telNumber) {
        this.FIO = FIO;
        this.telNumber = telNumber;
        this.boundedSubscribers = boundedSubscribers;
    }

    public String getFIO() {
        return FIO;
    }

    public long getTelNumber() {
        return telNumber;
    }

    public ArrayList<Long> getBoundedSubscribers() {
        return boundedSubscribers;
    }

    public void setBoundedSubscribers(ArrayList<Long> boundedSubscribers) {
        this.boundedSubscribers = boundedSubscribers;
    }
}
