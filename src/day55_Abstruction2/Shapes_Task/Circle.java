package day55_Abstruction2.Shapes_Task;

public final class Circle extends Shape{

    public double radius;

    public Circle (double radius){
        if(radius <= 0){
            throw new RuntimeException("Radius of Circle can not be 0 or less") ;
        }

        this.radius = radius;
        area = calcArea();
        perimeter = calcPerimeter();
        volume = calcVolume();
    }

      @Override
    public double calcArea(){
        return Math.pow(radius , 2)*Math.PI;
    }

    public double calcPerimeter(){
          return radius *2*Math.PI;
    }
    public double calcVolume(){
          return 0;
    }

    static {
        name = "Circle";
        hasVolume = false ;
    }

    @Override
    public String  toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
