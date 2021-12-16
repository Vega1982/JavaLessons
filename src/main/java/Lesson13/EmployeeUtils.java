package main.java.Lesson13;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class EmployeeUtils {
    public static void main(String[] args) {
        int employeesAmount;
        ArrayList<Employee> list = new ArrayList<>();
        int minimumWorkAge;

        Scanner console = new Scanner(System.in);
        System.out.print("Сколько сотрудников работает в компании? ");
        employeesAmount = console.nextInt();
        System.out.println("В компании работают сотрудники возрастом до 60 лет.");
        System.out.print("Распечатать ФИО сотрудников начиная с какого минимального возраста? ");
        minimumWorkAge = console.nextInt();
        System.out.println("Рандомно сгенерированные ФИО:");

        for (int i = 0; i < employeesAmount; i++) {
            list.add(employeeRandomGenerator());
        }

        String outFIO;

        ListIterator<Employee> listIter = list.listIterator();

        while (listIter.hasNext()) {
            outFIO = printEmployee(listIter.next(), minimumWorkAge);
            if (outFIO != null) {
                System.out.println(outFIO);
            }
        }

        System.out.println("-----------------------------");
        System.out.println("Теперь программа удалит из списка сотрудников,");
        System.out.println("стоящих на нечётных позициях, начиная с конца списка.");
        System.out.println("Работаю...");
        System.out.println("Было элементов в списке: " + list.size());


        while (listIter.hasPrevious()) {
            try {
                listIter.previous();
            } catch (Exception e) {
            }
            try {
                listIter.remove();
            } catch (Exception e) {
            }
            try {
                listIter.previous();
            } catch (Exception e) {
            }
        }

        System.out.println("Стало элементов в списке: " + list.size());
        System.out.println("Готово!");

    }

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

    public static Employee employeeRandomGenerator() {
        Random random = new Random();
        Employee employee = new Employee(getRandomFIO(), random.nextInt(10000) + 100, random.nextInt(60) + 1);
        return employee;
    }

    public static String printEmployee(Employee employees, int workAge) {
        String employeeFIO = employees.getFIO();
        if (workAge <= employees.getWorkAge()) {
            return employeeFIO;
        }
        return null;
    }

}
