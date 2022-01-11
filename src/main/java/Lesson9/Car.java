package Lesson9;


public class Car extends Automobile {
    public final double maxCarDistance = 500;
    private double distance = 0.0;
    private String title;

    public Car(String title) {
        this.title = title;
    }

    public void setDistance() {
        distance = Math.round(Math.random() * 1000);
    }


    public void move() {
        setDistance();
        if (distance <= maxCarDistance)
            System.out.println("Автомобиль " + title + " проехал " + distance + " км.");
        else {
            System.out.println("Автомобиль " + title + " проехал 500 км и у него кончился бензин.");
        }

    }
}
