package day57_Polymorphism.PhoneTask;

public class iPhone1 extends Phone1 implements AppleApp, Downloadable {


    public iPhone1(String model, String size, double price) {
        super("IPhone", model, size, price);

        if(price > 1500 || price < 0){
            throw new RuntimeException("Invalid price"+price);
        }
    }

    @Override
    public void texting(long num) {
        System.out.println("IPhone texting to"+num);
    }

    @Override
    public void calling(long num) {
        System.out.println("IPhone calling to"+num);
    }

    @Override
    public void download() {
        System.out.println("IPhone downloading app from"+AppStoreName);
    }

    public void faceTiming(long num){
        System.out.println("IPhone face timing to"+num);
    }

    @Override
    public String toString() {
        return "iPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
