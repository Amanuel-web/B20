package day50_Inheritance_OverRiding.ShapeTask;

public class ShapeObject {

    public static void main(String[] args) {

        Shape shape = new Shape();
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(3,5);

        System.out.println(circle.Area());
        System.out.println(rectangle.Area());
        System.out.println(shape.Area());
    }

}
