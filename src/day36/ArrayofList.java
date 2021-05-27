package day36;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayofList {
    public static void main(String[] args) {
        //Revers order//////////////////////////////////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

        /* ArrayList<Integer> list= new ArrayList<>();
                    list.add(10);
                    list.add(20);
                    list.add(30);
                    list.add(40);
                    list.add(50);


        System.out.println(list.size());
        
         for (int i = 0; i<= 4; i++) {
             System.out.println(list.get(i) + " ");
         }*/


 // sum of Digit from array from a string array/////////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        /*String str = "a1b2c3";
        int num =0 ;

           for(int i = 0; i <= str.length()-1 ; i++){
                 char each = str.charAt(i);
                 if(each >= 48 && each <= 57){
                  num += Integer.parseInt(""+each);
                 }
           }
        System.out.println(num);

           //oooooooooooooooorrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr
        num = 0;
        for(char aee : str.toCharArray()){
            if(Character.isDigit(aee)){
                num += Integer.parseInt(""+aee);
            }
        }
        System.out.println(num);*/


//combine to Array using Array List/////////////////////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

        /*String[] Group1 = {"Amn","ban","can","dan","fan"};
        String[] Group2 = {"bun","fun","gun"};

        ArrayList<String> studentList = new ArrayList<>();

         for(int i = 0; i <= Group1.length-1; i++){
             studentList.add(Group1[i]);
         }
         for(String each : Group2){
             studentList.add(each);
         }
        System.out.println(studentList);*/


//Array methods/////////////////////////////////////////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

        /*ArrayList<String> earlyList = new ArrayList<>();
               earlyList.add("test");
               earlyList.add("best");
               earlyList.add("rest");
               earlyList.add("vest");
               earlyList.add("quest");

        System.out.println(earlyList);
        earlyList.set(2,"paste");
        System.out.println(earlyList);
        //earlyList.clear();
       // System.out.println(earlyList);
        earlyList.remove(2);
        System.out.println(earlyList);
        earlyList.set(1,"done");
        System.out.println(earlyList);*/


//Array uniques recognizer  ////////////////////////////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

        /*ArrayList<Integer> list = new ArrayList<>();
                    list.add(1);
                    list.add(1);
                    list.add(2);
                    list.add(3);
                    list.add(3);

        ArrayList<Integer> uniques = new ArrayList<>();

        for (int i =0;i<=list.size()-1;i++) {
            //for(Integer element : list)
            Integer element = list.get(i);
            int count = 0;

            for (int each : list) {
                if (each == element) {
                    count++;
                }
            }
                if (count == 1) {
                    uniques.add(element);
                }
        }
            System.out.println(uniques);*/


//remove Dup////////////////////////////////////////////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

        /*ArrayList<Character> list = new ArrayList<>();
                      list.addAll(Arrays.asList('A','A','B','B','C','C'));

        System.out.println(list);

        ArrayList<Character> nonDup = new ArrayList<>();

        for(Character each : list){
                if(!nonDup.contains(each)){
                    nonDup.add(each);
            }
        }
        System.out.println(nonDup);*/

//Desending order from Array List

        /*ArrayList<Integer> list = new ArrayList<>();
                 list.add(30);
                 list.add(20);
                 list.add(40);
                 list.add(50);
                 list.add(10);

        Collections.sort(list);
        System.out.println(list);
        ArrayList<Integer> desList = new ArrayList<>();
        for(int i = list.size()-1; i >= 0; i--){
            desList.add(list.get(i));
        }
        System.out.println(desList);*/

//Swap method///////////////////////////////////////////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

       /* ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list);

        Collections.swap(list, 0, list.size()-1);

        System.out.println(list);*/

//Frequency method//////////////////////////////////////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

        /*ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('C');

        System.out.println(Collections.frequency(list,'A') );*/
    }
}
