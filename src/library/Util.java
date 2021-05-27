package library;

import java.util.Arrays;
import library.Util;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter ;
public class Util {
    public static void main(String[] args) {

    }

    public static String removeDup(String str){
        String nonDup = "";

        for( String each : str.split("") ){
            if( !nonDup.contains(each) ){
                nonDup += each;
            }
        }

        return nonDup;
    }
    // removes the duplicates and returns the value string

    public static String reverse(String str){
        String result = "";
        for(int i = str.length()-1;  i >=0 ; i--){
            result += str.charAt(i);
        }
        return result;
    }
    // reverse the string and return the value

    public static int frequency(String str, char ch){
        int count = 0;
        for(char each : str.toCharArray() ){
            if(each == ch){
                count++;
            }
        }

        return count;
    }
    //  finds the frequency of char from string str and returns it as int

    public static String uniques(String str){
        String uniques = "";

        for(char each  : str.toCharArray() ){
            int count =frequency(str, each);  // frequency of every character
            if(count == 1){
                uniques += each;
            }
        }

        return uniques;
    }
    // returns the uniques from the string

    public static String frequencyOfChars(String str){

        String expectedResult = "";
        String nonDup =    Util.removeDup(str);

        for(char each : nonDup.toCharArray() ){
            int count1 = Util.frequency(str, each);
            expectedResult +=   ""+ each + count1;
        }

        return expectedResult;
    }
    // returns the frequency of every single characters from a string

    public static int maxNum(int[] arr){
        int max = arr[0];

        for( int each : arr ){
            if(each > max){
                max = each;
            }
        }

        return max;
    }
    // find and returns the max number from in array

    public static int minNum(int[] arr){
        int min= arr[0];

        for( int each : arr ){
            if(each < min){
                min = each;
            }
        }

        return min;
    }
    // find and returns the min number from in array

    public static int[] combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for(int each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(int each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it

    public static int[] sortDesc(int[] arr){
        Arrays.sort(arr) ;

        int[] arr2 = new int[arr.length];

        int k = arr.length-1;
        for(int i=0; i<= arr2.length-1; i++){
            arr2[i] = arr [k];
            k--;
        }
        return arr2;
    }
    //Reverse a String Array
    public static double [] sortDesc(double [] arr){
        Arrays.sort(arr) ;

        double [] arr2 = new double[arr.length];

        int k = arr.length-1;
        for(int i=0; i<= arr2.length-1; i++){
            arr2[i] = arr [k];
            k--;
        }
        return arr2;
    }
    //Reverse a Double Array

    public static String[] sortDesc(String[] arr){
        Arrays.sort(arr) ;

        String[] arr2 = new String[arr.length];

        int k = arr.length-1;
        for(int i=0; i<= arr2.length-1; i++){
            arr2[i] = arr [k];
            k--;
        }
        return arr2;
    }
    //Reverse a String Array

    public static char[] sortDesc(char[] arr){
        Arrays.sort(arr) ;

        char [] arr2 = new char[arr.length];

        int k = arr.length-1;
        for(int i=0; i<= arr2.length-1; i++){
            arr2[i] = arr [k];
            k--;
        }
        return arr2;
    }
    //Reverse a Char Array

    public static void  uniqueInt(int[] arr) {
        for (int elements : arr) {
            int count = 0;
            for (int b : arr) {
                count++;
            }
            if (count == 1){
                System.out.println(elements+" ");
            }
        }
    }
    //Unique elements of an Array(Int)

    public static void  uniqueInt(String[] arr) {
        for (String elements : arr) {
            int count = 0;
            for (String b : arr) {
                count++;
            }
            if (count == 1){
                System.out.println(elements+" ");
            }
        }
    }
    //Unique elements of an Array(String)
}

