package day55_Abstruction2.Shapes_Task;

import day3.Main;

import java.text.DecimalFormat;

public final class Cylinder extends Shape{

    public double radius;
    public double height;

    public Cylinder(double radius, double height) {
        if(radius <= 0 || height <= 0){
            throw new RuntimeException("not 0");
        }

        this.radius = radius;
        this.height = height;
        area = calcArea();
        perimeter = calcPerimeter();
        volume = calcVolume();
    }

    @Override
    public double calcArea() {
        return (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius,2));
    }

    @Override
    public double calcPerimeter() {
        return (2*Math.PI*Math.pow(radius,2))+(2*Math.PI*radius+height);
    }

    @Override
    public double calcVolume() {
        return Math.PI*Math.pow(radius, 2)*height ;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + df.format(volume)+
                '}';
    }

    static {
        name = "Cylinder";
        hasVolume = true;




    }
}
