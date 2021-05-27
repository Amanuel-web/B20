package day41_toString_Practice;

import java.util.ArrayList;

public class CarpetObject {
    public static void main(String[] args) {
        Car[] carpets = {new Car(),new Car(),new Car(),new Car(),new Car()};

        carpets[0].customOrder(4.5,3.5,7.5,false);
        carpets[1].customOrder(5.5,3.5,7.5,true);
        carpets[2].customOrder(4.5,5.5,7.5,false);
        carpets[3].customOrder(3.5,3.5,7.5,true);
        carpets[4].customOrder(6.5,5.5,7.5,true);

        /*for (Car each: carpets ) {
            each.getInfo();
            System.out.println("=======================================================");
        }*/


        ArrayList<Car> persianCarpets = new ArrayList<>();
        ArrayList<Car> regularCarpets = new ArrayList<>();

        for(Car each : carpets){
            if(each.isPersian){
                persianCarpets.add(each);
            }else {
                regularCarpets.add(each);
            }
        }
        System.out.println("size "+persianCarpets.size());
        System.out.println("size "+regularCarpets.size());
    }
}
