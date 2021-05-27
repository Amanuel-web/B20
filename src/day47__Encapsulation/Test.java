package day47__Encapsulation;

public class Test {

    public static void main(String[] args) {

        System.out.println(AccessModifier.defaultVariable);
         Encapsulation obj1 = new Encapsulation();
         obj1.setSsn(obj1.getSsn()+1);
        System.out.println(obj1.getSsn() );



    }

}
