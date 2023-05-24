package org.example;
import org.example.Shape;
import java.math.*;
public class Circle extends Shape {
    /*
     Створити клас нащадків: сircle,  які містять в собі координати точок, необхідних для cтворення цих фігур.
     Перевизначити для класів нащадків необхідні методи
     */

    public double centerX;
    public double centerY;
    private double radiusLength;

    public Circle( double centerX, double centerY, double radiusLength ){
        super();
        this.centerX = centerX;
        this.centerY = centerY;
        setRadiusLength(radiusLength);
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
}
