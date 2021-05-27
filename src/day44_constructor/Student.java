package day44_constructor;

public class Student {

    String name;
    int age;
    char sex;
    static String schoolName = "Cybertec Unversity";


    public Student(String name,int age,char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;


    }

    /*public void setInfo(String name,int age ,char sex){

        this.name = name;
        this.age = age ;
        this.sex = sex;

    }*/

    public String toString(){
        return "Name: "+name+", Age:"+age+", Sex"+", School Name: "+schoolName;
    }
}
