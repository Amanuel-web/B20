package day42_Static;

public class Car {
    String brand;
    String model;
    String VIN;
    int year;
    double price;
    String color;

    static boolean hasWheel;
    static int numberOfTires = 4;
    static boolean hasEngin = true;

    public void start(){
        System.out.println("Starting "+brand+" model");
    }
    public static void printTires(){
        System.out.println(numberOfTires);
    }
    public String toString(){
        return "Brand:- "+brand+"\nModel:- "+model;
    }
}
