package day57_Polymorphism.PhoneTask;

public class Sumsung extends Phone1 implements Downloadable , AndroidApp {
    public Sumsung(String model, String size, double price) {
        super("Samsung", model, size, price);

        if(price > 1500 || price < 0){
            throw new RuntimeException("Invalid price for Samsung"+price);
        }
    }

    @Override
    public void download() {
        System.out.println("IPhone Downloading from "+AppStoreName);
    }

    @Override
    public void texting(long num) {
        System.out.println("IPhone texting to"+num);
    }

    @Override
    public void calling(long num) {
        System.out.println("IPhone calling to"+num);
    }

    public void freezing(){
        System.out.println("Samsung is freezing");
    }

    @Override
    public String toString() {
        return "Sumsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }
}
