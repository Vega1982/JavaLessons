package Lesson9;

public class Truck extends Automobile {
    private double distance = 0.0;
    private String title;

    public Truck(String title) {
        this.title = title;
    }

    public void setDistance() {
        distance = Math.round(Math.random() * 1000);
    }

    public void move() {
        setDistance();
        System.out.println("Автомобиль " + title + " проехал " + distance + " км.");

    }
}
