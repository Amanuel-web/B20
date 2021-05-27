package day46_ConstructorCall;



public class ConstructorCall {

    public ConstructorCall(){

       System.out.println("A");

    }

    public ConstructorCall(int a){

        this();
        System.out.println("B");

    }

    public ConstructorCall (String a){

        this(4);
        System.out.println("C");

    }

    public ConstructorCall (double a){

        this(4);
        System.out.println("E");

    }

    public ConstructorCall (char a){

        this();
        System.out.println("D");

    }

    public static void main(String[] args) {

        new ConstructorCall("B");

    }
}
