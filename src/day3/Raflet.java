package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Raflet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*String html = scan.nextLine();

        if(html.contains("<html>")){
            int startIndex = html.indexOf("id=");
            String j = html.substring(startIndex);
            String [] h = j.split("id=");
            System.out.println(Arrays.toString(h));
            int endIndex = html.indexOf(">C");
            System.out.println(html.substring(startIndex,127));
        }else {
            System.out.println("Invalid input!");
        }*/
        /*int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = {scan.nextDouble(),scan.nextDouble(),scan.nextDouble(),scan.nextDouble(),scan.nextDouble(),scan.nextDouble(),scan.nextDouble(),scan.nextDouble() };

                 for(int i = 0; i<=7;i++){
                     total += temps[i];

        }
                 avgTemp = total/8;
        System.out.println(avgTemp);*/
       /* String sentence = input.nextLine();

        String[] tt = sentence.split(" ") ;
        for(int i = 0; i<=tt.length-1;i++){
            System.out.println(tt[i]);
        }*/
        int size = input.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = input.nextInt();
        }
       // int[] num = input.nextInt();
        if(num.length-1 == 2 ||num.length-1 ==1){
            for(int each : num){
                System.out.println(each);
            }
        }else{
            for(int i = 0 ; i<2;i++){
                int num1 = num[0+i];
                System.out.println(num1);
            }
        }
    }
}
//<DocTYPE html><html><head><title>coding is a POWER</title></head><body><div class = "container"><ahref="http://www.fb.com" id="fb">CLICKi Here!<a>
//<!DOCTYPE html><html><head><title>Coding is a POWER</title></head><body><div class="container"><a href="http://www.fb.com" id="fb">Clicki Here!</a></div></body></html>