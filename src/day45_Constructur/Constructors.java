package day45_Constructur;

import java.util.ArrayList;
import java.util.Arrays;

public class Constructors {

    public Constructors(){

        System.out.println("no babe");

    }

    public Constructors(int a){

        System.out.println("babe");

    }

    public Constructors(String a){

        System.out.println("ha babe");

    }

    public static void main(String[] args) {

        Constructors obj1 = new Constructors("10");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> list2 = new ArrayList<>(list);
        System.out.println(list2 );

    }

}
