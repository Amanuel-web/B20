package day56_Abstruction3.AnimalTask;

public class Parrot extends Animal implements Flyable,Playable {


    @Override
    public void eat() {
        System.out.println("Parrots do eat");
    }

    @Override
    public void sleep() {
        System.out.println("Parrots do sleep");
    }
    @Override
    public void fly(){
        System.out.println("Parrots do fly");
    }

    @Override
    public void play() {
        System.out.println("Parrots do Play");
    }

}
