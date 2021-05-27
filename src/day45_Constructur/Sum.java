package day45_Constructur;

public class Sum {

    public Sum(int a, int b){

        System.out.println(a + b);

    }

    public Sum(int a, int b, int c){

        System.out.println(a + b + c);

    }

    public Sum(double a, double b){

        System.out.println(a + b);

    }
    public Sum(double a, double b, double c){

        System.out.println(a + b + c);

    }

    public static void main(String[] args) {

        Sum obj1 = new Sum(2,3);
    }
}
