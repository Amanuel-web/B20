package day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterablePractice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12,3,4,5,6,7,8,9));

        Iterator<Integer> list2 = list.iterator();

        while (list2.hasNext()){
            if (list2.next() < 5){
                list2.remove();
            }
        }

        System.out.println("+==========================================================================================+");

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(12,3,4,5,6,7,8,9));

        for (Iterator<Integer> i = list3.iterator() ;i.hasNext(); ){

            if(i.next() < 5){
                i.remove();
            }

        }


    }

}
