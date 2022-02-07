package Lesson22;

import java.util.Scanner;

public class WeatherRunner {
    public static void main(String[] args) {
        // Создадим и запросим у пользователя переменную для имени города
        Scanner console = new Scanner(System.in);
        System.out.print("Введите название города (по-английски): ");
        String town = console.nextLine();

        // Передадим название города в объект и запустим его метод для запроса на сервер и формирования файла с XML
        WeatherGetter weatherGetter = new WeatherGetter(town);
        weatherGetter.weatherwriter(town);

        // Попытаемся извлечь температуру (неудачно)
        XMLWeatherParser xmlWeatherParser = new XMLWeatherParser();
        xmlWeatherParser.parser();

    }


}

