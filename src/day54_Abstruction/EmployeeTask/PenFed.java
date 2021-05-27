package day54_Abstruction.EmployeeTask;

import java.time.LocalDate;

public class PenFed {

    public static void main(String[] args) {

        Tester tester = new Tester("Sare",'F', LocalDate.of(1993,03,04),"SDET",123456);

        System.out.println(tester.sex);
        System.out.println(tester.name);

        tester.name = "sabi";


        Developer developer = new Developer("Sare",'F', LocalDate.of(1999,03,04),"SDET",93456);

        System.out.println(developer);

    }

}
