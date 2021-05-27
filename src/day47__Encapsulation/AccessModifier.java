package day47__Encapsulation;

public class AccessModifier {

    public static int publicVariable = 100;

    public  static void publicMethod() {

        System.out.println("public Method()");

    }
    static int defaultVariable = 200;

    static void defaultMethod(){

        System.out.println("default Method");

    }

    private static int privatVariable = 300;


    private static void privateMethod(){

        System.out.println("Private Method");

    }


}
