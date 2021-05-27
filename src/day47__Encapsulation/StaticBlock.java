package day47__Encapsulation;

import java.util.ArrayList;

public class StaticBlock {

    static String companyName;

    static ArrayList<Integer> list;

    static {
        companyName = "Capital one";

        list = new ArrayList<>();
        list.add(10);
        list.add(20);
    }

}
