package Inherance.GeomatricalFigures;

public class Circle extends GeometricalFigures {

    private int radius;

    //The Circles constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    //Overriding the calculateArea method to fit a circles area equation
    @Override
    public int calculateArea() {
        double circleArea = 3.14 * (this.radius * this.radius);
        int areaInt = (int) circleArea;
        return areaInt;
    }
    //Overriding the calculatePerimeter method to fit a circles Perimeter equation
    @Override
    public int calculatePerimeter() {
        //Using a double attributes as the equation includes the use of PI
        double circlePerimeter = 2 * 3.14 * this.radius;
        //Typecasting to return an integer
        int perimeterInterger = (int) circlePerimeter;
        return perimeterInterger;
    }
}
