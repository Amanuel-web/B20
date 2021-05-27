package day48_Inheritance.DeviceTask;

public class DeviceObject extends Device {

    public static void main(String[] args)  throws InterruptedException {


        TV tv1 = new TV("LG", "N786", 2000, false, false, "55", true);

        tv1.watch();

        Phone phone1 = new Phone("Iphone", "8+", 500, true, true, "6", "IOS");
        phone1.Call("702-728-9181");
        phone1.text("702-728-9181");
    }
}