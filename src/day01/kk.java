package day01;
import java.util.*;
public class kk {
    public static void main(String[] args) {
        double price = 0, screenSize = 0, screenInch = 0;
        String storageType = "";
        String cpu = "";
        String screenResolution = "";
        String storage1 = "SSD";
        String storage2 = "HDD";
        String screen1 = "FULLHD";
        String screen2 = "4K";

        String cpu1 = "i3";
        String cpu2 = "i5";
        String cpu3 = "i7";
        int ram = 0, memoryType = 0, cpuResult = 0, ramResult = 0, storageResult = 0, screenResult = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Select screen size:");
        screenSize = scan.nextDouble();
        scan.nextLine();
        System.out.println("Select CPU type:");
        cpu = scan.nextLine();
        if (cpu.equals(cpu1)) { //cpu
            cpuResult += 150;
        } else if (cpu == cpu2) {
            cpuResult += 250;
        } else if (cpu.equals(cpu3)) {
            cpuResult += 350;
        }
        System.out.println("Select RAM type:");
        ram = scan.nextInt();
        ramResult = (ram / 4) * 50;//ram
        scan.nextLine();
        System.out.println("Select storage type:");
        storageType = scan.nextLine();

        System.out.println("Select memory type:");
        memoryType = scan.nextInt();
        if (storageType.equals(storage1)) {
            storageResult = (memoryType / 500) * 100;
        } else {
            storageResult = (memoryType / 500) * 50;
        }
        scan.nextLine();
        System.out.println("Select Screen Resolution:");
        screenResolution = scan.nextLine();
        if (screenResolution.equals(screen1)) {
            screenResult += 100;
        } else {
            screenResult += 200;
        }
        if (screenSize == 13.3) {   // screen size
            screenInch += 200;
        } else if (screenSize == 15.0) {
            screenInch += 300;
        } else {
            screenInch += 400;
        }
        double all = cpuResult + screenInch + screenResult + storageResult + ramResult;
        System.out.println("Laptop price is: $" + all);


        }
    }