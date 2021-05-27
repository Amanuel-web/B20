package day61_Maps;

import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) {

        List <Integer > list = new ArrayList<>();
        list.addAll(Arrays.asList(1,99,2,3,4,5,5,6,6,4,7,8,8,8,9,4));

        System.out.println(list);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list) ;
        System.out.println(set);

        list.clear();
        list.addAll(set);

        System.out.println(list);
    }

}
