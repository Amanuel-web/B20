package day48_Inheritance.DeviceTask;

public class Phone extends Device{

    public static boolean hasSimCard = true;
    public String OS;

    public Phone(String brand, String model, double price, boolean hasBattery, boolean hasMemory, String screenSize,String OS){
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
        this.OS = OS;
    }

    public void Call(String PhoneNumber)throws InterruptedException{
        System.out.println("Calling:...."+PhoneNumber);
        Thread.sleep(1000);
        System.out.print("Calling.");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(3000);
        System.out.print(".");
        System.out.println("Connected Successfuly");
    }

    public void text(String PhoneNumber)  {
        System.out.println("Texting to:..."+PhoneNumber);


    }
}
