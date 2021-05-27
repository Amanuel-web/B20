package Test;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };{
            for (int i = 0; i<=nums.length-(1+i);i++){
                int temp = nums[i];
                nums[i] = nums[nums.length -(1+i)];
                nums[nums.length -(1+i)] = temp;
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}
