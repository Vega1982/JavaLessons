package main.java.ArmyOfRats;

public class HeadTail {
    public static boolean headTailDeal(double tail, double tailCap) {
        // с вероятностью 50% считает
        // возвращает true если хвост >= принятому параметру хвоста
        if (tail >= tailCap) {
            return true;
        } else return false;

    }
}
