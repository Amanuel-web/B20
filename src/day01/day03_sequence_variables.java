package day01;

import java.io.IOException;
import java.io.InputStreamReader;

public class day03_sequence_variables {
    public static void main(String[] args)
        throws IOException
        {

            // InputStreamReader class to read input
            InputStreamReader inp = null;

            // Storing the input in inp
            inp = new InputStreamReader(System.in);

            System.out.println("Enter characters, "
                    + " and '0' to quit.");
            char c;
            do {
                c = (char)inp.read();
                System.out.println("Display prompt"+c);
            } while (c != '0');

    }
}
