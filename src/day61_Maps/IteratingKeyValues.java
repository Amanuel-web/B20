package day61_Maps;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IteratingKeyValues {

    public static void main(String[] args) {

        Map<String , LocalDate> map = new TreeMap<>();
        map.put("Ana",LocalDate.of(1998,4,6));
        map.put("Hasan",LocalDate.of(1988,9,20));
        map.put("Muhtar",LocalDate.of(1998,1,15));

        Set<String> va = map.keySet();
        for (String each :  va) {
            System.out.println(each);
        }

        System.out.println("===========================================================================================");
        
        for(LocalDate each : map.values()){
            System.out.println(each);
        }

    }

}
