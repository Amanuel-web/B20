package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Double> employee = new LinkedHashMap<>();
        employee.put("Elivera",100000.0);
        employee.put("Ana",120000.0);
        employee.put("Sam",125000.0);
        employee.put("Pogba",170000.0);
        System.out.println(employee +" : \n"+employee.size() );

    }

}
