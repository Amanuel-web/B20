package day01;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalProce = 0;
        String[] itemName = new String[11];
        double [] priceCount = new double[11] ;
        do {
            for (int i = 1 ; i<=11;i++) {
                System.out.println("Enter Item"+i+" and its price: ");
                 item = scan.nextLine();
                 itemName[i] = item;
                 price = scan.nextDouble() ;
                 priceCount[i] = price;
                 scan.nextLine() ;
                 totalProce +=price ;
                System.out.println("Add one more item?");
                countinue = scan.nextLine();
                count++;
                if(!countinue.equalsIgnoreCase("yes")){
                    break;
                }
            }
             for (int i = 1; i<count;i++) {

                 System.out.print("Item"+i+": "+itemName[i] +" Price"+": "+priceCount [i]+", ");
             }  System.out.println("\n"+totalProce);
        }while (countinue.equalsIgnoreCase("yes") );

    }

}
