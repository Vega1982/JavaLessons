package main.java.Lesson8;

public class Animals {
    public static void main(String[] args) {
        Mammals mickey = new Mouse("мышь", 1, 1.1);
        Mammals jerry = new Mouse("мышь", 2, 0.1);

        Mammals sora = new Cat("кошка", 8, 0.25);

        mickey.setKind("Мышь");
        mickey.setName("Микки");
        mickey.setVoice("Пи-пи");
        mickey.doVoice();
        jerry.setKind("Мышь");
        jerry.setName("Джерри");
        jerry.setVoice("За-пи-пи-пи");
        jerry.doVoice();

        sora.setKind("Кошка");
        sora.setName("Сора");
        sora.setVoice("Мяу-мур-мур");
        sora.doVoice();

    }
}
