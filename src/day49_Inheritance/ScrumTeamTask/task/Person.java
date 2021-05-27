package day49_Inheritance.ScrumTeamTask.task;

public class Person {

    public String name;
    public int age;
    public char sex;

    public long ssn;

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    private void eat() {
        System.out.println(name + " IS Eating");
    }

    private void walk(){
        System.out.println(name+" IS Walking");
    }

    public void sleep(){
        System.out.println(name+" IS Sleeping");
    }

    public void setInfo(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
