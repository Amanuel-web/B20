package Test;

import java.util.Scanner;

public class wrapperClass_Practice {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        System.out.println(a);

        byte b = Byte.MAX_VALUE;
        System.out.println(b);

        System.out.println("==========================================================================================================");

        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println(max);
        for(int i = 1; i<=5 ;i++){
            System.out.println("enter");
            int n = scan.nextInt();
              if(n > max){
                  max = n;
              }
              if(n < min){
                  min = n;
              }
        }

        System.out.println(max+"kkmkm");
        System.out.println(min+"saf");
    }
}
