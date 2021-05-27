package day61_Maps;

import library.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindrome {

    public static void main(String[] args) {

        String[] kk = {"Level","Ana","Java","Zeman","Kayak","Batch20"};

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(kk));

        System.out.println(list);

        Iterator<String> it = list.iterator();

        while(it.hasNext()){

            String each = it.next();

            String reverse = Util.reverse(each);

            /*for (int i = each.length()-1; i >= 0; i-- ){
               reverse += each.charAt(i);
            }*/


            if(!each.equalsIgnoreCase(reverse)){
                it.remove();
                System.out.print(each+" , " );
            }
        }



    }

}
