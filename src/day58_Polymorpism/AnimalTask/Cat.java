package day58_Polymorpism.AnimalTask;

public class Cat extends Animal {

    public String name;

    public Cat(String name,int age, char gender) {
        super(age, gender);
        this.name = name;

    }

    public void Scratch(){
        System.out.println(name + " is Scratch");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
