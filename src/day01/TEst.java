package day01;

import java.util.Scanner;

public class TEst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter");
        String high = input.nextLine() ;

           String n1 = (high.endsWith("ly")?"really":"NVM");
        System.out.println(n1);
        System.out.println("=**********************************************************+============");

        System.out.println("enter");
        String high2 = input.nextLine() ;

        System.out.println("enter");
        String high3 = input.nextLine() ;
        String n2 = (high2.equalsIgnoreCase(high3)?"THEY ARE EQUAL":"NOT EQUAL" );
        String up = high.substring(5,0) + high2.substring(5,0);
        System.out.println(n2);
        System.out.println(high2.length());
        //high.
      //  System.out.println(up.toUpperCase() );
        /*if(high2.equalsIgnoreCase(high3)){
            System.out.println("THEY ARE EQUAL :)");
        }else{
            System.out.println("NOT EQUAL :(");
        }*/
    }

}
