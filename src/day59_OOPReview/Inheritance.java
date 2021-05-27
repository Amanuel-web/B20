package day59_OOPReview;

class A{

    private int a = 100;
    int b = 200;
    protected int c = 300;
    public int d = 400;

    private void method(){}
    void method2(){}
    protected void method3(){
        System.out.println("hello world");
    }
    public void method4(){

    }

}

public class Inheritance extends A{

    public void method3(){
        System.out.println("huuu");
    }


    public static void main(String[] args) {

        Inheritance obj = new Inheritance();
        //System.out.println(obj.a); only private cannot be Inherit others can(protected, public,and b too)

       // obj.method();same goes too method



    }

}
