package Inherance.GeomatricalFigures;

public class Square extends GeometricalFigures{
    //The square's attributes
    private int length, height;

    //The square's constructor
    public Square (int length, int height){
        this.height = height;
        this.length = length;
    }

    @Override
    //Overriding the calculateArea method to fit a square's area equation
    public int calculateArea(){
        return this.length*height;
    }
    //Overriding the calculateArea method to fit a square's perimeter equation
    @Override
    public int calculatePerimeter(){
        return ((this.length*2) + (this.height*2));
    }
}
