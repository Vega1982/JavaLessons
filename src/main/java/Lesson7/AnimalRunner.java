package main.java.Lesson7;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog dogBarbos = new Dog(500, 20, null, "Барбос");
        //Dog dogCharly = new Dog(400, 30, null, "Чарли");
        //String nameBarbos = dogBarbos.dogName;
        //Integer runBarbos = dogBarbos.dogRun;

        System.out.println(dogRunner("Барбос", ));

    }
public static String dogRunner(String nameBarbos, Integer runBarbos) {
        String characterBarbos = "Собака по имени " + nameBarbos + "пробежала" + runBarbos;
        return characterBarbos;
    }
}
