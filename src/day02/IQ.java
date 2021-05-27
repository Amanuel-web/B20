package day02;


import library.Util;

public class IQ {

    public static void main(String[] args) {

        String st = "abc";
        String st22 = "cab";

        System.out.println(foq(st,st22));
    }

    public static boolean foq(String st1, String st2) {
        boolean non = false;
        String[] cc = st1.split("");
        String[] cc2 = st2.split("");

        for(int i = 0; i <= st1.length()-1; i++){

            if(!cc2.toString().contains(cc[1])){
                non = true;
            }else {
                non = false;
            }

        }

return non;
    }
}
