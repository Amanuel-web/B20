package day53_FinalKeyword;

import java.time.LocalDate;

public class FinalVariable {

    final static int a;

    static {
         a = 10;
    }

    public static void main(String[] args) {

        final LocalDate dob = LocalDate.of(2000,6,5);

        System.out.println(dob);

        final long ssn = 12345678;

        System.out.println(ssn);

        final double PI = 3.14;

        System.out.println(PI);

        final char gender = 'M';

    }

}
