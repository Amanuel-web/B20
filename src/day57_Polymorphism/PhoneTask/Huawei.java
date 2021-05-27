package day57_Polymorphism.PhoneTask;

public class Huawei extends Phone1 implements AndroidApp , AppleApp ,Downloadable{


    public Huawei( String model, String size, double price) {
        super("Huawei", model, size, price);

        if(price > 200 || price < 0){
            throw new RuntimeException("Invalid price for Samsung"+price);
        }
    }

    @Override
    public void download() {
        System.out.println("Huawei Downloading from "+AndroidApp.AppStoreName+"or"+AppleApp.AppStoreName);
    }

    @Override
    public void texting(long num) {
        System.out.println("Huawei texting to"+num);
    }

    @Override
    public void calling(long num) {
        System.out.println("Huawei calling to"+num);
    }

    public void stealInfo(){
        System.out.println("Huawei is stealing ur Info");
    }

    @Override
    public String toString() {
        return "Huawei{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $"  + price +
                '}';
    }
}
