package day45_Constructur;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {

        Item item1 = new Item("Apple",1.5,3);
        Item item2 = new Item("Breed ",0.97,5);
        Item item3 = new Item("Mango",9.89,2);
        Item item4 = new Item("Garbage",0.88,5);
        Item item5 = new Item("Milk",1.79,2);

        ArrayList <Item> list = new ArrayList<>();
        list.addAll(Arrays.asList(item1,item2,item3,item4,item5));


        System.out.println("Items:- "+list.size());
        double totalCost = 0;

        for (Item each : list ){
            totalCost += each.calCost();
        }


        System.out.println("\n"+totalCost+"\n");


        System.out.println("================================================================================================");


        Item[] items = {item1,item2,item3 ,item4 ,item5};

        double totalCost2 = 0;

        for (int i = 0;i <= items.length -1; i++){
           totalCost2  += items[i].calCost();
        }

        System.out.println("\n"+totalCost2 );
    }

}
