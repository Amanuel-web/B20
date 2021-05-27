package day58_Polymorpism;

import day58_Polymorpism.AnimalTask.Animal;
import day58_Polymorpism.AnimalTask.Cat;
import day58_Polymorpism.AnimalTask.Dog;

public class Instancof_KeyWord {

    public static void main(String[] args) {

        Animal animal = new Animal(10,'F');
        Animal animal1 = new Dog("sam",7,'M');
        Animal animal2 = new Cat("hate",7,'F');

        boolean a1 = animal instanceof Animal;

        System.out.println(a1);

        System.out.println(animal1 instanceof Dog);

    }

}
