package day47__Encapsulation;

import java.time.LocalDate;

public class PresonObject {

    public static void main(String[] args) {

        Person obj1 = new Person("man",43,'M', LocalDate.of(2000,4,01));

        System.out.println(obj1);

        obj1.setAddress("vagas");



    }

}
