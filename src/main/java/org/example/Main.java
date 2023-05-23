package org.example;

public class Main {
    public static void main(String[] args) {
        Shape newShape = new Shape();
        double[] arrayOfSideLengths = {2,2,2,1};
        System.out.println( newShape.calculateArea(arrayOfSideLengths) );
        System.out.println( newShape.calculatePerimeter(arrayOfSideLengths) );
        newShape.paint(arrayOfSideLengths) ;
        System.out.println("\n");
    }
}