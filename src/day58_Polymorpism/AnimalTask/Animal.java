package day58_Polymorpism.AnimalTask;

public class Animal {

    public int age;
    public char gender;

    public Animal(int age, char gender) {
        this.age = age;
        this.gender = gender;
    }

    public void eat(){

        System.out.println("eating");

    }

    public void sleep(){

        System.out.println("sleeping");

    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", gender=" + gender +
                '}';
    }
}
