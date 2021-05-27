package day56_Abstruction3.AnimalTask;

public class Penguin extends Animal implements Swimable ,Playable {
    @Override
    public void eat() {
        System.out.println("Penguins do eat");
    }

    @Override
    public void sleep() {
        System.out.println("Penguins do sleep");
    }

    @Override
    public void play() {
        System.out.println("Penguins do fly");
    }

    @Override
    public void swim() {
        System.out.println("Penguins do swim");
    }
}
