package Lesson20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

    private int personnelNumber;
    private String login;
    private String FIO;
    private String department;
    private String town;

    private String position;
    private int salary;

    public Employee(int personnelNumber, String login, String FIO, String department, String town) {
        this.personnelNumber = personnelNumber;
        this.login = login;
        this.FIO = FIO;
        this.department = department;
        this.town = town;
    }

    public Employee(String position, int salary) {
        this.position = position;
        this.salary = salary;
    }


}
