package day41_toString_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject2 {
    public static void main(String[] args) {
        Car[] carpets = {new Car(),new Car(),new Car(),new Car(),new Car()};

        carpets[0].customOrder(4.5,3.5,7.5,false);
        carpets[1].customOrder(5.5,3.5,7.5,true);
        carpets[2].customOrder(4.5,5.5,7.5,false);
        carpets[3].customOrder(3.5,3.5,7.5,true);
        carpets[4].customOrder(6.5,5.5,7.5,true);

        ArrayList<Car> persianCarpets = new ArrayList<>();
        persianCarpets.addAll(Arrays.asList(carpets));
        persianCarpets.removeIf(p -> !p.isPersian);
        ArrayList<Car> regularCarpets = new ArrayList<>();
        persianCarpets.addAll(Arrays.asList(carpets));
        persianCarpets.removeIf(p -> p.isPersian);
        System.out.println(persianCarpets.size());
    }
}
