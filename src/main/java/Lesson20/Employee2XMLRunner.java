package Lesson20;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Employee2XMLRunner {
    public static void main(String[] args) throws JAXBException {
        // Создадим 3 объекта для департамента
        Employee department1 = new Employee(486236, "IvanovPI", "Ivanov Petp Ivanovich", "Kadry", "Vladivostok");
        Employee department2 = new Employee(986512, "PetrovIP", "Petrov Ivan Petrovich", "Sklad", "Novosibirsk");
        Employee department3 = new Employee(742596, "SidorovIP", "Sidorov Ivan Petrovich", "Prodazhy", "Sochi");

        // Создадим 3 объекта для должности
        Employee position1 = new Employee("Kadrovik", 25000);
        Employee position2 = new Employee("Kladovschik", 15000);
        Employee position3 = new Employee("Prodazhnik", 35000);

        // Создадим список, содержащий объекты
        Employees employees = new Employees();
        employees.employees.add(department1);
        employees.employees.add(department2);
        employees.employees.add(department3);
        employees.employees.add(position1);
        employees.employees.add(position2);
        employees.employees.add(position3);

        System.out.println(employees);

        // Маршалинг объектов во внешний файл employee.xml
        marshalingEmployees (employees);

        // С помощью XPath найдём всех, у кого ЗП превышает среднее значение

    }

    // Метод для сохранения объектов в XML
    private static void marshalingEmployees(Employees emp) throws JAXBException
    {
        JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //Marshal the employees list in file
        jaxbMarshaller.marshal(emp, new File("c:/temp/employees.xml"));
    }
}
