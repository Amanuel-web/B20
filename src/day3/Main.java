package day3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //float[] score = new float[7];
        //WRITE YOUR CODE HERE
        int size = scan.nextInt();
        int[] num = new int[size];
        int[] num1 = new int[2];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
//WRITE YOUR CODE HERE
        
        }
        /*float max = score[0];
        float min = Integer.MAX_VALUE;
        float count = 0.0f;
        for(int i = 0; i <= 6 ; i++){
            System.out.println("Enter score for judge "+(i+1));
            score[i] = input.nextFloat();
            if(max < score[i]){
                max = score[i];
            }
            if(min > score[i]){
                min = score[i];
            }
        }
        System.out.println("Enter difficulty: ");
        float  dif = input.nextFloat();
        for(int i = 0; i <= 6 ; i++) {
            if (score[i] != max && score[i] != min) {
                count += score[i];
            } else {
                continue;
            }
        }
        float total = count * dif * 0.6f;
        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);*/
    }
