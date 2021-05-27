package day39_CustomClass;

public class Car {
    String Car;
    String model;
    String brand;
    String color;
    int year;
    double price;
    double mileage;

      public void setInfo(String carBrand, String carModel,String carColor, int carYear, double carPrice, double carMileage){
          brand = carBrand;
          model = carModel;
          color = carColor;
          year = carYear;
          price = carPrice;
          mileage = carMileage;
      }
      public void getInfo(){
          System.out.println(year +" ,"+brand+", "+model+", "+color+" ,"+mileage+", $"+price+" ");
      }
}
