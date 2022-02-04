package Lesson22;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileWriter;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class WeatherGetter {
    private String town = "London";
    public String APIKey = "da131e509b5f48fe7a220311aecf9506";

    public WeatherGetter(String town) {
        this.town = town;
    }

    @SneakyThrows
    public void weatherwriter(String town) {
        // Создадим файл, и на всякий случай очистим его, если он уже существует
        File file = new File("c:/temp/weather.xml");
        FileChannel.open(Paths.get("c:/temp/weather.xml"), StandardOpenOption.WRITE).truncate(0).close();

        // Сформируем строку API Call и запишем её в файл
//        String APICallString = "http://api.openweathermap.org/data/2.5/weather?q=" + town + "&lang=ru&units=metric&mode=xml&appid=da131e509b5f48fe7a220311aecf9506";
        String APICallString = "http://api.openweathermap.org/data/2.5/weather?q=" + town + "&lang=ru&units=metric&mode=xml&appid=da131e509b5f48fe7a220311aecf9506";
//        FileWriter writer = new FileWriter("c:/temp/weather.xml", false);
//        writer.write(APICallString);
//        writer.flush();

        URL weatherUrl = new URL(APICallString);
        URLConnection weatherUrlCon = weatherUrl.openConnection();
        weatherUrlCon.setDoOutput(true);
        weatherUrlCon.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/97.0.4692.71 Safari/537.36");
        weatherUrlCon.connect();
        Scanner scanner = new Scanner(weatherUrlCon.getInputStream());
        FileWriter writer = new FileWriter("c:/temp/weather.xml", false);
        while (scanner.hasNextLine()) {
            writer.write(scanner.nextLine());
        }
        writer.flush();


    }
}
