package day54_Abstruction.EmployeeTask;

import java.time.LocalDate;

public final class Developer extends Employee{

    public Developer(String name, char sex, LocalDate dob, String jobTitle, double salary){
        super(name, sex, dob, jobTitle, salary);
    }

}
