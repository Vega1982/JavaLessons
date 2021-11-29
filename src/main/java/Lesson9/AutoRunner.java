package main.java.Lesson9;

public class AutoRunner {
    public static void main(String[] args) {
        Automobile volkswagen = new Car("Volkswagen");
        Automobile renault = new Car("Renault");
        Automobile stellantis = new Car("Stellantis");
        Automobile bmw = new Car("BMW");
        Automobile kia = new Car("KIA");

        Automobile toyota = new Truck("Toyota");
        Automobile hyundai = new Truck("Hyundai");
        Automobile generalMotors = new Truck("General Motors");
        Automobile geely = new Truck("Geely");
        Automobile kamaz = new Truck("Kamaz");

// лоика: т.к. по условиям задачи рандомная дистанция у автомобилей всегда менее 1000 км,
// а грузовики по опредению проезжают до 1200 км, то проверка максимального хода у грузовиков
// не выполняется. Для легковых автомобилей выполняется проверка максимального хода в 500 км.
// Если рандом выдаёт более 500км, то считается, что легковое авто проезжает все 500 км,
// а затем у него кончается бензин, что отражено в сообщении.

        Automobile[] vehicles = new Automobile[]{volkswagen, renault, stellantis, bmw, kia,
                toyota, hyundai, generalMotors, geely, kamaz};
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].move();
        }

    }


}
