package day54_Abstruction.EmployeeTask;

import java.time.LocalDate;

public class Employee {

    public String name;
    final public char sex;
    final public LocalDate dob;
    public String jobTitle;
    public double salary;

    public Employee(String name, char sex, LocalDate dob, String jobTitle, double salary) {
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "name='" + name +", sex=" + sex +", dob=" + dob +", jobTitle='" + jobTitle +", salary=" + salary
              ;
    }
}
