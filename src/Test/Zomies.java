package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Zomies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System .in );
        int[] inhabitants = new int[8];
        for(int i = 0; i<inhabitants.length; i++){
            inhabitants[i] = input.nextInt();
        }
        int[] ban = inhabitants;
        int count = 0;
        System.out.println("Day"+count +Arrays.toString(inhabitants));
        for (int i =0; i <= inhabitants.length ;i++){

                inhabitants[inhabitants.length - 2] /= 2;
              /*if(inhabitants.length-2 == 0){
                  break;
              }*/
            count++;
            System.out.println("Day"+count +Arrays.toString(inhabitants));
        }
        System.out.println("---- EXTINCT ----");
        String z = "popcorn";
        z = z.substring(1,8);
        System.out.println(z);
    }
}
