package day01;

import java.util.Scanner;

public class gg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        String[] arr = new String[8] ;
        int n = 1,a,k=0;
        for (int i = 0; i < 8; i++){
            arr [i] = input.nextLine() ;
        }
        for(int j = 1; j <= 8; j++){
            for (a = k ; a < 8;) {
                System.out.print(arr[k] + " , ");

                if (k >= n) {
                    k+=1;
                    n++;
                    break;
                            }
                k+=1;
                                }
                n++;
            System.out.println();
            }

        }
    }

