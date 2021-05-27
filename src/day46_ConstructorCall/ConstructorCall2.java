package day46_ConstructorCall;

public class ConstructorCall2 {

    public ConstructorCall2 (){

        System.out.println("X");

    }

    public ConstructorCall2 (int a){
           this();
        System.out.println("Y");

    }

    public ConstructorCall2 (double a){

        this(4);
        System.out.println("Z");

    }

}
