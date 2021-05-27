package day01;

import java.util.Scanner;
import library.Util;

public class methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item1 = "";
        String[] fuck = {"A", "b", "c"};
        fuck = Util.sortDesc(fuck) ;
        /*for (int i = 1; i <= 3; i++) {
            System.out.println("Enter Item" + i + ", count and its price:");
            String item = scan.nextLine();
            item1 = item;
            int count = scan.nextInt();
            scan.nextLine();
            double price = scan.nextDouble();
            scan.nextLine();
        }

            System.out.println("item1" + item1);
            System.out.println(fuck);*/
        }




}
