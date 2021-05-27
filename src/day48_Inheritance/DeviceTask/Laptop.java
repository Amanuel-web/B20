package day48_Inheritance.DeviceTask;

public class Laptop extends Device{

    public static boolean hasCPU;
    public static boolean hasMouse;
    public static boolean hasKeyboard;

    public String OS;

    public void setInfo(String brand, String model, double price, boolean hasBattery, boolean hasMemory, String screenSize,String Os){
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
        this.OS = OS;

    }

    public void coding(String language){
        System.out.println("coding "+language);
    }
}
