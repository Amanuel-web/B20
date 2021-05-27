package day57_Polymorphism.EmployeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {

    public static void main(String[] args) {

        Employee tester = new Tester("Aman",12345,"SDET",124567,'M');

        Employee tester1 = new Tester("mane",12346,"SDET",134567,'M');

        Employee developer = new Developer("Amana",23456,"Devop",234567,'M');

        Employee developer1 = new Developer("mana",23457,"Devop",254567,'M');

        Employee developer2 = new Developer("eman",23458,"Devop",294567,'F');

        Employee SM = new ScrumMaster("Nes",34567,"SM",111904,'F');

        ArrayList <Employee> list = new ArrayList<>();
        list.addAll(Arrays.asList(tester,tester1 , developer ,developer1 ,developer2 ,SM));

        for (Employee each : list){

            System.out.println(each);

            System.out.println("========================================\n========================================");

           // System.out.println(each.name+":- $ "+each.salary);

        }

    }

}
