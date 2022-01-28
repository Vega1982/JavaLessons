package Lesson20;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.xml.bind.annotation.*;

@NoArgsConstructor
//@RequiredArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

    @XmlElement(name = "personnelNumber")
    public int personnelNumber;

    @XmlAttribute(name = "login")
    public String login;

    @XmlAttribute(name = "FIO")
    public String FIO;

    @XmlAttribute(name = "department")
    public String department;

    @XmlAttribute(name = "town")
    public String town;

    @XmlAttribute(name = "position")
    public String position;

    @XmlAttribute(name = "salary")
    public int salary;

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
