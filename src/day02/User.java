package day02;

import java.util.Scanner;

public class User {
    public static void main(String[] bLm) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ur birth year?");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){

        int age = scanner.nextInt();
        System.out.println("Eneter ur name");
        Scanner Name = new Scanner(System.in);
        String name = Name.nextLine();
        age = 2020 - age;
        if (age >= 0 && age <= 100)
            System.out.println("ur name is = " + name + " , and ur age is=" + age);
        else {
            System.out.println("enter valid age");

        }

        }
        else {
            System.out.println("invalid argument");
        }
    }
}
