package day58_Polymorpism;

import day54_Abstruction.CarTask.Car;
import day54_Abstruction.CarTask.Tesla;
import day57_Polymorphism.PhoneTask.Iphone;
import day57_Polymorphism.PhoneTask.Phone;

public class DownCasting {

    public static void main(String[] args) {

        Phone phone = new Iphone("12max",1200,"6.7");

        Iphone iphone = (Iphone)phone;

        iphone.FaceTime(12345);

        ((Iphone) phone).FaceTime(123456);

    }

}
