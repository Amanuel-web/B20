package Test;

import java.util.Arrays;

public class wrapperClassPractice {
    public static void main(String[] args) {
        Integer[] arr ={2,3,5,6,7} ;

        for (int each : arr){ //unboxing
            System.out.println(each);
        }
        char ch = 79;
        Character ch1 = 79;
        System.out.println(ch + ch1);


        System.out.println("=============================================================================================");
        String[] nums1 = {"12.5","13.5","14.5","15.5"};
        double[] nums2 = new double[nums1.length];

         for (int i = 0; i <= nums1.length-1; i++){
             nums2[i] = Double.parseDouble(nums1[i]);
         }
        System.out.println(Arrays.toString(nums2));

    }
}
