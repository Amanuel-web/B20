package Test;

import java.util.Scanner;
import library.Util;
public class largestArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] words = str.split(",");
        /*for(int i = 0; i < 5; i++){

            words[i] = input.nextLine();
        }*/
        String  max = words[0];
       // String[] Max = new String[words.length-1] ;
        int count =0;
        for(String each : words ){
            if(max.length() > each.length()){
            // String[] Max[count] = each;
             count++;
            }
        }
        System.out.println(max);
    }
}
