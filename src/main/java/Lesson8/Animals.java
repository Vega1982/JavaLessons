package main.java.Lesson8;

public class Animals {
    public static void main(String[] args) {
        Mammals mickey = new Mouse("мышь", 1, 1.1);
        Mammals jerry = new Mouse("мышь", 2, 0.1);

        mickey.setKind("мышь");
        mickey.setName("Микки");
        mickey.setVoice("Пи-пи");
        mickey.doVoice();
    }
}
