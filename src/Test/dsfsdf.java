package Test;

import java.util.Arrays;
import java.util.Scanner;

public class dsfsdf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        if (email.contains("@")) {
            int count = 0;
            char ch = '@';
            for (char each : email.toCharArray()) {
                if (each == ch) {
                    count++;
                }
            }
                if (count >= 2) {
                    System.out.println("invalid email");
                    System.exit(0);
                } else {
                    String afterSplit[] = email.split("@");
                    String Email_Id = afterSplit[0];
                    String Email_Domain = afterSplit[1];
                    System.out.println("Email id"+Email_Id);
                    System.out.println("Email domain"+Email_Domain);

                }
            }else {
            System.out.println("invalid email");
            System.exit(0);
        }

    }
}
