package main.java.ArmyOfRats;

public class HeadPisk {
    public static boolean headPiskDeal (double pisk, double piskCap) {
        // с вероятностью 50% считает
        // возвращает true если писк >= принятому параметру писка
        if (pisk >= piskCap) {
            return true;
        } else return false;

    }
}
