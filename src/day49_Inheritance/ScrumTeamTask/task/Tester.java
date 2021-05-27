package day49_Inheritance.ScrumTeamTask.task;

public class Tester extends Employee {

    public Tester(String name, int age, char sex, int salary, int ID, String jopTitle){
        setInfo(name, age, sex, salary, ID, jopTitle);
    }

    public void smokeTesting(){
        System.out.println(name+"started a smoke test");
    }

    public void creatingTicket(){
        System.out.println(name+"Create Ticket");
    }

}
