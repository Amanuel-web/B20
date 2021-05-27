package day48_Inheritance.DeviceTask;

public class TV extends Device{

    public boolean remoteControl;

    public void watch(){
        System.out.println("Watching "+brand+" "+model);
    }

    public TV(String brand, String model, double price, boolean hasBattery, boolean hasMemory, String screenSize,boolean remoteControl) {
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
        this.remoteControl = remoteControl;
    }


}
