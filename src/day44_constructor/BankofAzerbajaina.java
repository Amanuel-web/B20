package day44_constructor;

import java.util.ArrayList;
import java.util.Arrays;
import static day44_constructor.HR.*;
public class BankofAzerbajaina {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        list.addAll(Arrays.asList(HR.employee1,employee2,employee3 )) ;

        System.out.println("================================+++++++++++++++++++++++---------------------------------------------------------+++++++++++++++++++++++++=============================");

        for (Employee  each :  list){
            System.out.println(each.name+":- " + each.salary);
        }

    }
}
