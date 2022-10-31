package org.example.oop.abstraction.arrayofobjects;

public class Area extends Shape{
    private final Float PI = 3.14F;
    //prints the area of rectangle with given input parameters
    @Override
    void rectangleArea(Integer length, Integer breadth) {
        System.out.printf("the area of rectangle is %d%n",(length*breadth));
    }
    //prints the area of square with given input length value
    @Override
    void squareArea(Integer length) {
        System.out.printf("the area of square is %d%n ",(length*length));
    }
    //prints the circle area with given input radius value
    @Override
    void circleArea(Integer radius) {
        System.out.printf("the area of circle is %f%n ",(float)(PI*radius*radius));
    }
}
