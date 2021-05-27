package day45_Constructur;

public class Item {

    String name;
    double unitPrice;
    int quality;

    public Item(String name, double unitPrice, int quality) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quality = quality;
    }

    public double calCost(){

        return unitPrice * quality ;
    }

    public String toString(){

        return "Name:- "+name+"\nCost:- $"+calCost();
    }
}
