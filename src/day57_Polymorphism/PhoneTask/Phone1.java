package day57_Polymorphism.PhoneTask;

public abstract class Phone1 {

    public String brand , model, size;
    public double price;

    public abstract void texting(long num);

    public abstract void calling(long num);

    public Phone1(String brand, String model, String size, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        if(price <= 0){
            throw new RuntimeException("Price of the phone cannot b negative or zero");
        }
        this.price = price;
    }

}
