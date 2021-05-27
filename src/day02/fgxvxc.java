package day02;

import java.util.Arrays;
import java.util.Scanner;


public class fgxvxc {
    public static void main(String[] args) {
        int num,digit1, digit2 , digit3, digit4, digit5;
        int[] aee = new int[5];
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
            for(int i = 0;num>0;i++){
                aee[i] = num % 10;
                num = num / 10;
        }
        for (int i = 4; i>0;i--){
         //   Arrays.sort(aee);
            Arrays.toString(aee);
            System.out.println(aee[i]);
        }
        System.out.println(aee[0]);
    }
}