package Inherance.GeomatricalFigures;

import java.util.ArrayList;

public class Calculator {
    public static void main(String[] args) {

        //Creating an object of each class and giving the associated attributes values based on their constructor.
        Square square = new Square(4,8);
        Triangle triangle = new Triangle(3,8,4,8,3);
        Circle circle = new Circle(7);


        //Printing the result to the console
        System.out.println("The square's area is: \n" + square.calculateArea());
        System.out.println("The square's perimeter is: \n" + square.calculatePerimeter());
        System.out.println("The triangle's area is: \n" + triangle.calculateArea());
        System.out.println("The triangle's perimeter is: \n" + triangle.calculatePerimeter());
        System.out.println("The circle's area is: \n" + circle.calculateArea());
        System.out.println("The Circle's perimeter is: \n" + square.calculatePerimeter());


    }
}
