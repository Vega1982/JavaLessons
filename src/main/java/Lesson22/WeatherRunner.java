package Lesson22;

import java.io.File;
import java.util.Scanner;

public class WeatherRunner {
    public static void main(String[] args) {
        // Создадим и запросим у пользователя переменную для имени города
//        String town = null;
//        Scanner console = new Scanner(System.in);
//        System.out.print("Введите название города (по-английски): ");
//        String town = console.nextLine();
//
//        WeatherGetter weatherGetter = new WeatherGetter(town);
//        weatherGetter.weatherwriter(town);

        XMLWeatherParser xmlWeatherParser = new XMLWeatherParser();
        xmlWeatherParser.parser();

        // Сформируем строку API Call
//        String APICallString = "http://api.openweathermap.org/data/2.5/weather?q=" + town + "&lang=ru&units=metric&mode=html&appid=da131e509b5f48fe7a220311aecf9506";
    }
//    File file = new File("c:/temp/weather.xml");
//    public static void tempShower(File file) {



    }

