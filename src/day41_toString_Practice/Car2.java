package day41_toString_Practice;

public class Car2 {
    String brand;
    String model;
    int year;
    double price;
    String color;

    public void setInfo(String brand,String model,int year,double price,String color){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }
    public String toString(){
        return "Brand:- "+brand+"\nModel:- "+model+"\nYear:- "+year+"\nColor:- "+color+"\nPrice:- "+"$"+price;
    }
}
