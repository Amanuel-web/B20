package day54_Abstruction.EmployeeTask;

import day49_Inheritance.ScrumTeamTask.task.ScrumTeam;

import java.time.LocalDate;

public final class Tester extends Employee {

    public Tester(String name, char sex, LocalDate dob, String jobTitle, double salary){
        super(name, sex, dob, jobTitle, salary);
    }

    public void findBug(){
        System.out.println(name+"found a bug");
    }
}
