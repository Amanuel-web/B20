package day41_toString_Practice;

public class Car {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public void customOrder (double width ,double length ,double unitPrice ,boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double totalPrice = (width * length)*unitPrice;
        return isPersian ? totalPrice +200:totalPrice;

    }

    public void getInfo(){
        System.out.println("Width:- "+width+"\nLength:- "+length+"\nUnit Price:- "+unitPrice+"\nPersian Carpet:-"+isPersian+"\nTotal Price:- "+calcCost());
    }

    public String toString(){
        return "0";
    }
}
