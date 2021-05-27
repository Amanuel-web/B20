package day42_Static;

public class StaticMethod {

    int a = 200;
    static int b = 400;

    public static void main(String[] args) {

        StaticMethod obj = new StaticMethod();
        System.out.println(obj.a);
        System.out.println(b);

        staticMethod();
        StaticMethod.staticMethod();
        obj.instantMethod();

    }
    public static void staticMethod(){

    }
    public void instantMethod(){

    }
}
