package Lesson14;

import java.util.*;

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

        // После того, как список абонентов наполнен, добавляем каждому абоненту 100 других как связанных с ним
        // Код ниже любезно предоставлен преподаваетелем
        Random random = new Random();
        for (Subscriber listOfSubscriber : listOfSubscribers) {
            for (int i = 0; i < 100; i++) {
                Subscriber randomSubscriber;
                randomSubscriber = listOfSubscribers.get(random.nextInt(listOfSubscribers.size()));
                listOfSubscriber.getBoundedSubscribers().add(randomSubscriber);
            }
        }

        // Найдём самый часто встречающийся номер из числа связанных
        // Создадим список для хранения тел. номеров
        Long[] array = new Long[10000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = Long.valueOf(i + 100);
        }

        // Создадим коллекцию Set для временного хранения сотни номеров (они тоже в Set)
        HashSet<Subscriber> setForNumber = new HashSet<>();

        // Цикл проходит по всем абонентам и извлекает колекцию связанных абонентов
        for (int i = 0, j = 100, k = 0; i < subscribersAmount; i++) {
            // Сущьность для временного хранения одного абонента
            Subscriber tempSubscriber;
            tempSubscriber = listOfSubscribers.get(i);
            // наполняем временную коллекцию сотней абонентов
            setForNumber.addAll(tempSubscriber.getBoundedSubscribers());
            // втроенный цикл для пробега по колллекции из сотни связанных абонентов
            for (Subscriber tempS : setForNumber) {
                Long t = tempS.getTelNumber();
                // каждый из сотни номеров добавляем в массив
                array[j + k] = t;
                k++;
            }
            j = j + 100;
            k = 0;
        }
        System.out.println("Самый часто повторяющийся номер в связанных номерах: " + mostPopularPhoneNumber(array));


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

//    // Метод поиска самого часто встречающегося связанного тел. номера
//    public static long boundTelNum() {
//
//        long bN = 100;
//        return bN;
//    }

    // взятый из инета метод для поиска самого часто встречающегося элемента в массиве
    public static Long mostPopularPhoneNumber(Long[] array) {

        long[] counts = new long[100000];
        int maxCount = 0;
        int maxKey = 0;

        for (int i = 0; i < array.length; i++) {
            try {
                counts[Math.toIntExact(array[i])]++;
            } catch (Exception e) {
                if (maxKey == 100) {
                    break;
                }
            }

            try {
                if (counts[Math.toIntExact(array[i])] > maxCount) {
                    maxCount = Math.toIntExact(counts[Math.toIntExact(array[i])]);
                    maxKey = Math.toIntExact(array[i]);
                }
            } catch (Exception e) {
                if (maxKey == 100) {
                    break;
                }

            }
            if (maxKey == 100) {
                break;
            }

        }
        return Long.valueOf(maxKey);
    }

}
