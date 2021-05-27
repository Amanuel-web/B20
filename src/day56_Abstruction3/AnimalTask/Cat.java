package day56_Abstruction3.AnimalTask;

public class Cat extends Animal implements Playable{


    @Override
    public void eat() {
        System.out.println("Cats do eat");
    }

    @Override
    public void sleep() {
        System.out.println("Cats do sleep");
    }

    public void play(){
        System.out.println("Cats are very friendly");
    }

}
