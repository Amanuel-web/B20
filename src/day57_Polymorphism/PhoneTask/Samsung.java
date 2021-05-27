package day57_Polymorphism.PhoneTask;

public class Samsung extends Phone{


    public Samsung( String model, double price, String size) {
        super("Samsung", model, price, size);
        if(price <= 0 || price > 1200){
            throw new RuntimeException("Invalid Price "+price);
        }
    }

    @Override
    public void calling(long number) {
        System.out.println("Samsung Calling to "+number);
    }

    @Override
    public void texting(long number) {
        System.out.println("Samsung Texting to "+number);
    }

    public void freezing(){
        System.out.println("Samsung is freezing");
    }

    @Override
    public String toString() {
        return "Samsung Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
