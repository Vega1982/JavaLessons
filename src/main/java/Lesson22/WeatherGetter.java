package Lesson22;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class WeatherGetter {
    //    public String APIKey = "da131e509b5f48fe7a220311aecf9506";

    public WeatherGetter() {
    }

    @SneakyThrows
    public void weatherwriter(String town) {
        // Создадим файл, и на всякий случай очистим его, если он уже существует
        File file = new File("c:/temp/weather.xml");
        FileWriter anotherWriter = new FileWriter("c:/temp/weather.xml", true);
        anotherWriter.write("");
        FileChannel.open(Paths.get("c:/temp/weather.xml"), StandardOpenOption.WRITE).truncate(0).close();

        // Сформируем строку API Call и запишем её в файл (на всякий случай)
        // API key будем брать из ресурсного файла с диска
        File APIfile = new File("c:/temp/weatherapikey.txt");
        FileReader fr = new FileReader(APIfile);
        BufferedReader reader = new BufferedReader(fr);
        String APIKey = reader.readLine();
        String APICallString = "http://api.openweathermap.org/data/2.5/weather?q=" + town + "&lang=ru&units=metric&mode=xml&appid=" + APIKey;
        FileWriter writer = new FileWriter("c:/temp/weatherAPICall.txt", false);
        writer.write(APICallString);
        writer.flush();

        // Используя API Call запросим температуру и запишем ответ сервера в файл XML
        URL weatherUrl = new URL(APICallString);
        URLConnection weatherUrlCon = weatherUrl.openConnection();
        weatherUrlCon.setDoOutput(true);
        weatherUrlCon.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/97.0.4692.71 Safari/537.36");
        weatherUrlCon.connect();
        Scanner scanner = new Scanner(weatherUrlCon.getInputStream());
        while (scanner.hasNextLine()) {
            anotherWriter.write(scanner.nextLine());
        }
        anotherWriter.flush();
    }
}
