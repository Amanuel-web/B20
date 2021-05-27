package day60_Collection;

import java.util.*;

public class SetInterface {

    public static void main(String[] args) {

        Set <Integer> set = new HashSet<>();

        set.addAll(Arrays.asList(8,5,4,3,2,10,7,1));//does not keep the order
        Arrays.asList(8,8,8,8,8);//doesn't accept duplicate

        System.out.println(set);

        Set <Integer> set1 = new LinkedHashSet<>();//does keep the order

        set1.addAll(Arrays.asList(8,5,4,3,2,10,7,1)) ;

        Set <Integer> set2 = new TreeSet<>();
        set2.addAll(Arrays.asList(8,5,4,3,2,10,7,1));
        set.addAll(Arrays.asList(8,8,8,8,8));
        System.out.println(set2 );

    }

}
