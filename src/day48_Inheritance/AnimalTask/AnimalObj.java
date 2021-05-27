package day48_Inheritance.AnimalTask;

public class AnimalObj {

    public static void main(String[] args) {

        Dog obj1 = new Dog("sam","Medium",3,'F');
        obj1.bark();
        obj1.eat();
        obj1.sleep();

        System.out.println(obj1);
    }

}
