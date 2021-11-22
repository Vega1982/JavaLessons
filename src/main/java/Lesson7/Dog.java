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

    public void run (Integer dogRun) {
        System.out.println("пробежала " + dogRun + " метров");
    }

}
