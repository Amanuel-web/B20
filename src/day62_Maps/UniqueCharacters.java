package day62_Maps;

import java.util.*;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "abacbdeefj";
        Map<String , Integer> map = new LinkedHashMap<>();

        List<String> list = Arrays.asList(str.split(""));

        for(String each : list ) {

            if(Collections.frequency(list , each ) == 1){

                map.put(each,1);
            }

        }
        System.out.println(map);

        System.out.println(map.containsKey("j"));
    }

}
