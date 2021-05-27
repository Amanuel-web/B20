package day55_Abstruction2.Shapes_Task;

public final class Rectangle extends Shape{

    public double length;
    public double width;

    public Rectangle(double length, double width) {
        if(width <= 0 || length <= 0){
            throw new RuntimeException("not 0 pls");
        }


        this.length = length;
        this.width = width;
        area = calcArea();
        perimeter = calcPerimeter();
        volume = calcVolume();
    }

    @Override
    public double calcArea() {
        return width * length ;
    }

    @Override
    public double calcPerimeter() {
        return (width * length) * 2;
    }

    @Override
    public double calcVolume() {
        return 0;
    }

    static {
        name = "Rectangle";
        hasVolume = false;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
