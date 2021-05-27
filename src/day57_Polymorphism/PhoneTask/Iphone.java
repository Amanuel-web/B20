package day57_Polymorphism.PhoneTask;

public final class Iphone extends Phone{


    public Iphone( String model, double price, String size) {
        super("Iphone", model, price, size);
        if(price <= 0 || price > 1500){
            throw new RuntimeException("Invalid Price "+price);
        }
    }

    @Override
    public void calling(long number) {
        System.out.println("Iphone Calling to "+number);
    }

    @Override
    public void texting(long number) {
        System.out.println("Iphone Texting to "+number);
    }

    public void FaceTime(long number){
        System.out.println("Face Timing "+number);
    }

    @Override
    public String toString() {
        return "Iphone Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
