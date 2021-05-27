package day61_Maps;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class MapPractice2 {

    public static void main(String[] args) {

        LinkedHashMap<String , Integer > student = new LinkedHashMap<>();
        student.put("Ana",89);
        student.put("Aman",96);
        student.put("Ash",81);
        student.put("Pogba",76);
        student.put("Bus",66);

        LinkedHashMap<String , Integer> EB = new LinkedHashMap<>();
        LinkedHashMap<String , Integer> AB = new LinkedHashMap<>();

        for (String each :  student.keySet()) {

            Integer eachValue = student.get(each);

            if(eachValue >= 95){
               EB.put(each,eachValue);
            }else {
                AB.put(each,eachValue);
            }

        }

        System.out.println(AB);
        System.out.println("EB = " + EB);

    }

}
