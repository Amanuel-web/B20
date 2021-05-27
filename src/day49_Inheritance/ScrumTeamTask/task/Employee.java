package day49_Inheritance.ScrumTeamTask.task;

public class Employee extends Person {

    public int salary;
    public int ID;
    public String jopTitle;

    public void setInfo(String name, int age, char sex, int salary, int ID, String jopTitle) {
        setInfo(name,age,sex);
        this.salary = salary;
        this.ID = ID;
        this.jopTitle = jopTitle;
    }

    public void work(){
        System.out.println(name+" was working");
    }

}
