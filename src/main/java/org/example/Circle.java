package org.example;
import org.example.Shape;

import java.awt.*;
import java.math.*;
import java.util.Objects;

public class Circle extends Shape {
    /*
     Створити клас нащадків: сircle,  які містять в собі координати точок, необхідних для cтворення цих фігур.
     Перевизначити для класів нащадків необхідні методи
     Коректно перевизначити методи equals(), hashCode(), toString().
     */

    public double centerX;
    public double centerY;
    private double radiusLength;

    public Circle( double centerX, double centerY, double radiusLength){
        super();
        this.centerX = centerX;
        this.centerY = centerY;
        setRadiusLength(radiusLength);
        this.myShapeName = "Circle";

        setColor(Color.BLUE);
    }

    public void setRadiusLength(double radiusLength) {
        if (radiusLength >= 0){
            this.radiusLength = radiusLength;
        }else{
            System.out.println("Радіус кола має бути невід'ємним! ");
            this.radiusLength = 0;
        }
    }

    public double getRadiusLength() {
        return radiusLength;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radiusLength * radiusLength;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radiusLength * radiusLength;
    }

    @Override
    public void paint() {
        System.out.print("Малюю коло... \n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.centerX, centerX) == 0 && Double.compare(circle.centerY, centerY) == 0 && Double.compare(circle.radiusLength, radiusLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(centerX, centerY, radiusLength);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centerX=" + centerX +
                ", centerY=" + centerY +
                ", radiusLength=" + radiusLength +
                '}';
    }
}
