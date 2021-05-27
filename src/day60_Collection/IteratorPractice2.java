package day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorPractice2 {

    public static void main(String[] args) {

        String[] aa = {"Ahmad","Aman","Abse","Ahmes","Ahmed"};

        ArrayList <String> names = new ArrayList<>(Arrays.asList());
        Iterator<String> ab = names.iterator();

        while(ab.hasNext()){

            if (ab.next().equals("Ahmed")){
                ab.remove();

            }

        }

    }

}
