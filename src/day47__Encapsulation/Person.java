package day47__Encapsulation;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char sex;
    public LocalDate DOB;
    private int ssn;
    private int ID;
    private String address;

    public Person(String name, int age, char sex, LocalDate DOB) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.DOB = DOB;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", DOB=" + DOB +
                '}';
    }
}
