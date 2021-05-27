package day01;

import java.util.Scanner;

public class GFD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String output = "";
      //  String DB = "";
        if (word.contains("x") || word.contains("X")) {
            if (word.charAt(0) == ('x')  && (word.charAt(word.length() - 1) == ('X') || word.charAt(word.length() - 1) == ('x'))  ) {
                for (int i = 0; i <= word.length() - 1; i++) {
                    System.out.println(i);
                    if (word.charAt(i) == ('x') || word.charAt(i) == ('X')) {
                        continue;
                    } else {
                        output = "" + word.charAt(i);
                        System.out.print(output);
                    }
                }
            } else if ((word.charAt(0) == ('x') || word.charAt(0) == ('X') )&& (word.charAt(word.length() - 1) != ('x') || word.charAt(word.length() - 1) != ('X')) ){
                System.out.println((word.substring(1,word.length())) );
                System.out.println("2");
            } else if ((word.charAt(word.length() - 1) == ('X') || word.charAt(word.length() - 1) == ('x')) && (word.charAt(0) != ('x') || word.charAt(0) != ('X')) ){
                for (int i = 0; i <= word.length() - 1; i++) {
                    if (word.charAt(i) == ('X') || word.charAt(i) == ('x')) {
                        continue;
                    } else {
                        output = "" + word.charAt(i);
                        System.out.print(output);
                    }
                }

            }

        } else {
            System.out.println(word);
        }

    }
}