package Lesson20;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(name = "employees")
@XmlRootElement
public class Employees {
    @XmlElementWrapper(name="employees", nillable = true)
    @XmlElement(name = "employee")
    public List employees = new ArrayList<>();

//    public Employees(List employees) {
//        this.employees = employees;
//    }

    public Employees() {
    }
}
