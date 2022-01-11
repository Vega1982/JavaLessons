package Lesson10;


public enum DegreesNames {
    CELSIUS(" градусов Цельсия"), FAHRENHEIT(" градусов Фаренгейта");

    private String degrees;

    DegreesNames(String degrees) {
        this.degrees = degrees;
    }

    public String getDegrees() {
        return degrees;
    }

}
