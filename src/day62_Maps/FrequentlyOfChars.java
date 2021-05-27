package day62_Maps;

import java.util.*;

public class FrequentlyOfChars {

    public static void main(String[] args) {

        String str = "aaabbbccb";


        Map<String , Integer> map = new LinkedHashMap<>();

        List <String> list = Arrays.asList(str.split(""));

        for(String each : list) {
            int count = Collections.frequency(list,each);

            map.put(each,count);

        }

        System.out.println( map );
    }

}
