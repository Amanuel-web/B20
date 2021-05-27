package day55_Abstruction2.Shapes_Task;

public class ShapeObj {

    public static void main(String[] args) {

       Circle circle = new Circle(2.5);

        System.out.println(circle);
        System.out.println(Circle.hasVolume);
        System.out.println("==========================================================");
        Rectangle rectangle = new Rectangle(3, 5);

        System.out.println(rectangle);
        System.out.println("==========================================================");
        Cylinder cylinder = new Cylinder(2.5, 5);

        System.out.println(cylinder);

    }

}
