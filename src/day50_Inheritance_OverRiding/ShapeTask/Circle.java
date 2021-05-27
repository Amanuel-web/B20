package day50_Inheritance_OverRiding.ShapeTask;

public class Circle extends Shape{

    public double radius;
    public double diameter;
    public static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
        diameter = radius * 2;
        area = Area();
        perimeter = perimeter();
    }

    public double Area(){
        return radius * radius * PI;
    }

    public double perimeter(){
        return diameter * PI;
    }

}
