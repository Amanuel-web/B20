package day3;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {


    public static void main(String[] args) {
        DecimalFormat m = new DecimalFormat("0.00") ;
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy EEEE") ;
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm:ss a");

             double a = 22/7.0;
             LocalDate DB = LocalDate.of(2021,7,4) ;
             //may/20/2019 dayName 4:30
        DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE hh:mm a");
        LocalDateTime time1= LocalDateTime.of(1998,7,4,16,30);
        System.out.println(m.format(a));
        System.out.println(DB);
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(DB.format(df));
        System.out.println(LocalTime.now().format(tf) );
        System.out.println(time1);
        System.out.println(time1.format(dtFormat));
        Double t1 = 300.0;
    }
}
