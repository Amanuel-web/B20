package day58_Polymorpism.AnimalTask;

import day55_Abstruction2.A;

public class Zoo {

    public static void main(String[] args) {

       Dog dog = new Dog("max",6,'M');

       dog.sleep();

       dog.eat();

       dog.bark();

        System.out.println("++++++++++++++++++++++++++++++++=============================================+++++++++++++++");

       Animal animal = new Dog("baba",7,'F');

       animal.eat();

        new Cat("hate",8,'M');

    }

}
