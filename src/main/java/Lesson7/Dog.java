package main.java.Lesson7;

public class Dog {
    Integer dogRun;
    Integer dogJump;
    Integer dogFly;
    String dogName;

    public Dog(Integer dogRun, Integer dogJump, Integer dogFly, String dogName) {
        this.dogRun = dogRun;
        this.dogJump = dogJump;
        this.dogFly = dogFly;
        this.dogName = dogName;


    }

    public void setDogRun(Integer dogRun) {
        this.dogRun = dogRun;
    }

    public void setDogJump(Integer dogJump) {
        this.dogJump = dogJump;
    }

    public void setDogFly(Integer dogFly) {
        this.dogFly = dogFly;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    void dogRun() {
        System.out.println("Собака " + dogName + " пробежала " + dogRun + " метров.");
    }

    void dogJump() {
        System.out.println("Собака " + dogName + " прыгает на " + dogJump + " сантиметров.");
    }

    void DogFly() {
        if (dogFly == null) {
            System.out.println("Собака " + dogName + " не умеет летать");
            System.out.println("--------------------");
        } else {
            System.out.println("Собака " + dogName + " летает " + dogFly + " километров.");
            System.out.println("--------------------");
        }
    }

}


