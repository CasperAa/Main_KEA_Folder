package Inherance.GeomatricalFigures;

public class Triangle extends GeometricalFigures{
    //The triangles attributes
    private int sideA, sideB, sideC, length, height;

    //Triangle's constructor
    public Triangle (int sideA, int sideB, int sideC, int length, int height){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.length = length;
        this.height = height;
    }

    //Overriding the calculateArea method to fit a circle's area equation
    @Override
    public int calculateArea(){
        //Using double as the equation includes a decimal number
        double triangleArea = this.length * 0.5 * this.height;
        //Typecasting to return an integer
        int areaInt = (int) triangleArea;
        return areaInt;
    }
    //Overriding the calculateArea method to fit a circle's perimeter equation
    @Override
    public int calculatePerimeter(){
        return (this.sideA + this.sideB + this.sideC);
    }
}
