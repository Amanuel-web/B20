package day48_Inheritance.AnimalTask;

public class Dog extends Animal{

    public Dog(String name,String size,int age,char sex){
        setInfo(name, size,age,sex);
    }

    public void bark(){
        System.out.println(name+" Barking");
    }

}
