package day49_Inheritance.ScrumTeamTask.task;

public class Developer extends Employee {

    public Developer(String name, int age, char sex, int salary, int ID, String jopTitle){
        setInfo(name, age, sex, salary, ID, jopTitle);
    }

    public void Coding(){
        System.out.println(name+" Is Coding");
    }

    public void fixBug(){
        System.out.println("Bug Fixed");
    }

}
