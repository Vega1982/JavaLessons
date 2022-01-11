package ArmyOfRats;

public class HeadFat {

    public static boolean headFatDeal (double fat, double fatCap) {
        // с вероятностью 50% считает
        // возвращает true если жирнота >= принятому параметру жирноты
        if (fat >= fatCap) {
            return true;
        } else return false;

    }
}
