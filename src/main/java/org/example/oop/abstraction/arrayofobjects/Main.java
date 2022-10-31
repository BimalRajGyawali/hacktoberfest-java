
package org.example.oop.abstraction.arrayofobjects;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Area[] areas = new Area[5];
        //for loop for array of size 5 for creating the object
        for (int i = 0; i < 5; i++) {
            areas[i] = new Area();
        }
        //for loop for calling the abstract method by different array of obejcts.
        for (int i = 0; i < 4; i++) {
            Integer length = random.nextInt(40);
            Integer breadth = random.nextInt(30);
            Integer radius = random.nextInt(15);
            areas[i].rectangleArea(length, breadth);
            areas[i].squareArea(length);
            areas[i].circleArea(radius);

        }
        Integer radius = random.nextInt(15);
        areas[4].circleArea(radius);
    }
    }


