package day60_Collection;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {

        String abc = "ccccccccccccccccccccaaaaaaaaaadffffgggggggggj";
        String[] arr = abc.split("");

        Set<String> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(arr));
        System.out.println(set1);

        String s1 = "zzzzzzzzzzzzzzzzxxxxxxxxxxxxxxxxvvvvvvvvv";
        s1 = new LinkedList<>(Arrays.asList(s1.split("")) ).toString() ;

        System.out.println("============================================================================================");

        String a1 = "abcabc";
        String a2 = "cab";

        HashSet<String> b1 = new HashSet<>();
        b1.addAll(Arrays.asList(a1.split("")));

        System.out.println(b1);

        HashSet<String> b2 = new HashSet<>();
        b2.addAll(Arrays.asList(a2.split("")));

        System.out.println(b1.equals(b2));

        System.out.println("============================================================================================");

        String[] names = {"Alia","Sam","Mustefa","Messe","Pogba","Mustefa","Sam"};

        LinkedHashSet<String> aa = new LinkedHashSet<>();
        aa.addAll(Arrays.asList(names));
        System.out.println(aa);

        System.out.println("================================================================================");

        String[] name2 = {"Pogba","De Gea","Mata","Pogba","Pogba","Pogba"};

        name2 = new LinkedHashSet<>(Arrays.asList(name2 )).toArray(new String[0]);

        System.out.println(Arrays.toString(name2));

    }

}
