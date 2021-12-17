package main.java.Lesson14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class PhonebookRunner {
    public static void main(String[] args) {
        int subscribersAmount = 10000; // Кол-во абонентов

        // Объявляем список с будущими абонентами
        ArrayList<Subscriber> listOfSubscribers = new ArrayList<>();

        // Наполняем список работниками через метод
        for (int i = 0; i < subscribersAmount; i++) {
            listOfSubscribers.add(subscriberRandomGenerator());
        }

        // Создадим коллекцию Set и скопируем в неё все элементы ранее созданного списка абонентов
        HashSet<Subscriber> setOfSubscribers = new HashSet<>();
        setOfSubscribers.addAll(listOfSubscribers);

        // Создадим коллекцию Map и скопируем в неё все элементы ранее созданного списка абонентов
        HashMap<Integer, Subscriber> mapOfSubscriber = new HashMap<>();
        for (int k = 0; k < subscribersAmount; k++) {
            mapOfSubscriber.put(numbersForMap(k), subscriberForMap(k, listOfSubscribers));
        }

        // после того, как список абонентов наполнен, я хочу заполнить для каждого ArrayList boundedSubscribers,
        // поместив туда 100 ссылок на других рандомных абонентов основгого списка listOfSubscribers
        // но как это сделать?


    }

    // взятый из инета метод генерации случайных строк. Здесь они формируют ФИО сотрудника
    public static String getRandomFIO() {
        Random random = new Random();
        int length = random.nextInt(30) + 15;
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    // создание объектов работников со случайными параметрами
    public static Subscriber subscriberRandomGenerator() {
        Subscriber subscriber = new Subscriber(getRandomFIO(), randomPhoneNumber());
        return subscriber;
    }

    // метод генерации случайного тел. номера от 80000000000 до 89999999999
    public static long randomPhoneNumber() {
        long max = 89999999999L;
        long min = 80000000000L;
        max -= min;
        return (long) (Math.random() * ++max) + min;
    }

    // Метод, возвращающий число (от 1 до 10000) в качестве ключа для Map
    public static int numbersForMap(int i) {
        return (i++) - 1;
    }

    // Метод, возвращающий объект абонента из списка (по-порядку)
    public static Subscriber subscriberForMap(int k, ArrayList<Subscriber> list) {
        return list.get(k);
    }

}
