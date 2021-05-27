package day42_Static;

public class Studdent {
    String name;
    int age;
    int groupNuber;
    char gender;

    static String schoolName = "CyperTec School";

    public void setInfo(String name,int age,int groupNuber,char gender){

        this.name = name;
        this.age = age;
        this.groupNuber = groupNuber;
        this.gender = gender;
    }
    public String toString(){
        return "School Name:- "+schoolName+"\nStudent Name:- "+name+"\nAge:- "+age+"\nSex"+gender+"\nGroup Number"+groupNuber;
    }
}
