package day60_Collection;

import day54_Abstruction.CarTask.Car;

import java.util.*;

public class LstInterface {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();// add , remove, set.......

        list.addAll(Arrays.asList(1,2,3,4,5));
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list.get(5));//fastest thn rest to get method

        List<Integer> list1 = new LinkedList<>();

        list1.addAll(Arrays.asList(1,3,5,7,9));
        System.out.println(list1.get(3));//fastest on add/remove method

        List<Integer> list2 = new Vector<>();

        list2.addAll(Arrays.asList(2,4,6,8,10));

        List<Integer> list3 = new Stack<>();

        list3.addAll(Arrays.asList(1,3,5,7,9));

        ((Stack)list3).pop();
        System.out.println(list3 );

        System.out.println("==========================================================================================");

        /*List<String> group1 = new ArrayList<>();
        List<String> group2 = new ArrayList<>();
        List<String> group3 = new ArrayList<>();
        List<String> group4 = new ArrayList<>();
        List<String> group5 = new ArrayList<>();*/

        List<List<String>> groups = new ArrayList<>();
        groups.addAll(Arrays.asList(

                new Stack <>(),
                new Stack <>(),
                new Stack <>(),
                new Stack <>(),
                new Stack<>()
        ));

        System.out.println(groups );

        groups.get(0).addAll(Arrays.asList("aman","sema","gema","fefma"));
        groups.get(1).addAll(Arrays.asList("man","eman","gman","fma"));
        groups.get(2).addAll(Arrays.asList("aman","sema","gema","fefma"));
        groups.get(3).addAll(Arrays.asList("aman","sema","gema","fefma"));
        groups.get(4).addAll(Arrays.asList("aman","sema","gema","fefma"));

        //System.out.println(groups );

        groups.get(0).removeIf(p-> p.equalsIgnoreCase("gema"));

     //   System.out.println(groups);

        for (List<String> each :  groups ) {

            ((Stack)each).pop();
            System.out.println("group= " + each);

        }

        List<Car> SUVs = new ArrayList<>();
        List<Car> sedans = new ArrayList<>();

        List <List <Car>> jj = new ArrayList<>();
        jj.get(0).addAll(SUVs);
        jj.get(1).addAll(sedans);

        //System.out.println(jj);
        ((Car)jj.get(0)).start();

    }

}
