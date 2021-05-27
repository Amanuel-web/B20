package day58_Polymorpism;

import day58_Polymorpism.AnimalTask.Animal;
import day58_Polymorpism.AnimalTask.Cat;
import day58_Polymorpism.AnimalTask.Dog;

public class TypeCasting {

    public static void main(String[] args) {

        Dog dog = new Dog("A",2,'F') ;

        Animal animal = dog;//done implicitly

        Cat cat = new Cat("A",3,'M');

        Animal animal1 = cat;//converting sub type to super type, implicitly





    }

}
