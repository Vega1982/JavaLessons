package main.java.Lesson7;

import java.util.Scanner;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog dogBarbos = new Dog(500, 20, null, "Барбос");

        System.out.println("Собака соседа Барбос:");
        dogBarbos.dogRun();
        dogBarbos.dogJump();
        dogBarbos.DogFly();

        Dog dogCharly = new Dog(-1, -1, null, "Чарли");

        Scanner console = new Scanner(System.in);
        System.out.println("Насколько хорош пёс Чарли?");
        System.out.print("На сколько метров Чарли может бегать: ");
        Integer charlyRun = console.nextInt();
        System.out.print("На сколько сантиметров Чарли может прыгать: ");
        Integer charlyJump = console.nextInt();
        System.out.print("На сколько километров Чарли может летать (если не умеет, то введите 0): ");
        Integer charlyFly = console.nextInt();
        System.out.println("-------------------");

        dogCharly.setDogRun(charlyRun);
        dogCharly.setDogJump(charlyJump);
        if (charlyFly == 0) {
            charlyFly = null;
        }
        dogCharly.setDogFly(charlyFly);

        dogCharly.dogRun();
        dogCharly.dogJump();
        dogCharly.DogFly();

        SphinxCat catSora = new SphinxCat(100, 100, null, "Сора");

        System.out.println("=^_^=   =^_^=   =^_^=   =^_^=");
        System.out.println("Моя кошка Сора:");
        catSora.catRun();
        catSora.catJump();
        catSora.catFly();


        SphinxCat catMurka = new SphinxCat(50, 180, null, "Мурка");
        System.out.println("=^_^=   =^_^=   =^_^=   =^_^=");
        System.out.println("Кошка соседки: " + catMurka.catName);
        catMurka.catRun();
        catMurka.catJump();
        catMurka.catFly();

        Dragon heroicDragon = new Dragon(-1, -1, null, "Unknown");
        System.out.println("====================");
        System.out.println("Создай своего дракона!");

        System.out.print("Как зовут вашего дракона? ");
        String heroicDragonName = console.next();

        System.out.print("На сколько метров ваш дракон может бегать: ");
        Integer heroicDragonRun = console.nextInt();
        System.out.print("На сколько сантиметров ваш дракон может прыгать: ");
        Integer heroicDragonJump = console.nextInt();
        System.out.print("На сколько километров ваш дракон может летать (если не умеет, то введите 0): ");
        Integer heroicDragonFly = console.nextInt();
        System.out.println("-------------------");

        heroicDragon.setDragonName(heroicDragonName);

        if (heroicDragonRun == 0) {
            heroicDragonRun = null;
        }
        heroicDragon.setDragonRun(heroicDragonRun);

        if (heroicDragonJump == 0) {
            heroicDragonJump = null;
        }
        heroicDragon.setDragonJump(heroicDragonJump);


        if (heroicDragonFly == 0) {
            heroicDragonFly = null;
        }
        heroicDragon.setDragonFly(heroicDragonFly);


        System.out.println("============================");
        System.out.println("Вашего дракона зовут " + heroicDragon.getDragonName());
        heroicDragon.DragonRun();
        heroicDragon.DragonJump();
        heroicDragon.DragonFly();

    }


}

