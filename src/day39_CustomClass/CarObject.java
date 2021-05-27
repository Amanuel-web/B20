package day39_CustomClass;

public class CarObject {
    public static void main(String[] args) {

        Car car1 = new Car();
         car1.model = "CHR";
         car1.brand = "BMW";
         car1.color = "Black";
         car1.year = 2018;
         car1.mileage = 0.0;
         car1.price = 28000;

        System.out.println( car1.model);
        System.out.println(car1.brand);
        System.out.println( car1.color);
        System.out.println(car1.year);
        System.out.println( car1.mileage);
        System.out.println(car1.price);
        Car car2 = new Car();
        car2.setInfo("Chr","toyota","black",2020,28900,0.0);
        car2.getInfo();
    }
}
