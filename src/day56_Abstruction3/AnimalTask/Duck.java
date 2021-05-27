package day56_Abstruction3.AnimalTask;

public class Duck extends Animal implements Flyable ,Swimable ,Playable {


    @Override
    public void eat() {
        System.out.println("Ducks do eat");
    }

    @Override
    public void sleep() {
        System.out.println("Ducks do sleep");
    }

    @Override
    public void fly() {
        System.out.println("Ducks do fly");
    }

    @Override
    public void swim() {
        System.out.println("Ducks do swim");
    }

    @Override
    public void play() {
        System.out.println("Ducks do play");
    }
}
