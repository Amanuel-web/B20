package day56_Abstruction3;

public abstract class Abstruction__V_Interface {

    private int a;
    protected static int b;

    public void method1(){
      // -----> System.out.println("instant variable can have a body in  abstract");
    }

    public abstract void method();

    public Abstruction__V_Interface (int a){
        this.a = a;
    }

    static {
        b = 300;//static block possible
    }

}

interface A{

    int a = 10;//public static final

    /*public A(){
       // not possible to have a constructor in interface
    }*/

    static void method2(){}//public

    abstract void method3();//public

    void method4();//public abstract

}