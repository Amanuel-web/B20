package day48_Inheritance.AnimalTask;

public class Cat extends Animal{

    public Cat(String name,String size,int age,char sex) {
        setInfo(name, size, age, sex);
    }

    public void meo(){
        System.out.println(name+" meowing");
    }

}
