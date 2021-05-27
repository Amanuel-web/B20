package day52_Exception;

import java.time.LocalDateTime;

public class MultiCatchBlock {

    public static void main(String[] args) {

        String driverName = "fire fox";

        if(driverName.equalsIgnoreCase("chrome")){
            System.out.println("Set up chrome");
        }else if(driverName.equalsIgnoreCase("fire fox".trim())){
            System.out.println("set up fire fox");
        }else {
            throw new RuntimeException("Invalid Browser name");
        }

        System.out.println("============================================================================================");

        if(LocalDateTime.now().getMinute() == 45){
            throw new RuntimeException("Break Time");
        }else {
            System.out.println("Suck it upqqqke");
        }

    }

}
