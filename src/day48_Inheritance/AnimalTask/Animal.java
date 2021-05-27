package day48_Inheritance.AnimalTask;

public class Animal {

    public String name;
    public String size;
    public int age;
    public char sex;

    public void setInfo(String name,String size,int age,char sex){
                this.name = name;
                this.age = age;
                this.sex = sex;
                this.size = size;
    }

    public void eat(){
        System.out.println(name+"  is eating");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                '}';
    }
}
