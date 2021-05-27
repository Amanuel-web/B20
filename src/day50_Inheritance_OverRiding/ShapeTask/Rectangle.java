package day50_Inheritance_OverRiding.ShapeTask;

public class Rectangle extends Shape{

    public double width;
    public double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        area = Area();
        perimeter = perimeter();
    }

    public double Area() {
        return width * length;
    }

    public double perimeter() {
        return (width + length) * 2;

    }
}
