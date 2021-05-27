package library;

import java.util.Scanner;
public class Time {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in );
        int n = scan.nextInt() ;
        for(int i = n ; i >=0 ;i--){
            n -= 1;
            if(i == 0){
                break;
            }
            for (int j =59;j>=0;j--) {
                System.out.println(n+" Minutes"+" and "+ j+" Second" );
                Thread.sleep(1000);
                if(j == 0){
                    break;
                }
            }

        }
        System.out.println("********************************************************************************************");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("-------------------------THE TIME HAS COME TO AN END----------------------------------------");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("********************************************************************************************");
    }
}
