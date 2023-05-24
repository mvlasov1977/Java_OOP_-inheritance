package org.example;
import org.example.Shape;

import java.util.Objects;

public class Rectangle extends Shape {
    /*
    Створити клас нащадків: rectangle,  які містять в собі координати точок, необхідних для cтворення цих фігур.
    Перевизначити для класів нащадків необхідні методи
    Коректно перевизначити методи equals(), hashCode(), toString().
 */

    private double firstVertexOfRectangle_X;
    private double firstVertexOfRectangle_Y;
    private double secondVertexOfRectangle_X;
    private double secondVertexOfRectangle_Y;
    private double thirdVertexOfRectangle_X;
    private double thirdVertexOfRectangle_Y;
    private double fourthVertexOfRectangle_X;
    private double fourthVertexOfRectangle_Y;
    private boolean isRectangle;
    public Rectangle(double firstVertexOfRectangle_X, double firstVertexOfRectangle_Y,
                     double secondVertexOfRectangle_X, double secondVertexOfRectangle_Y,
                     double thirdVertexOfRectangle_X, double thirdVertexOfRectangle_Y,
                     double fourthVertexOfRectangle_X, double fourthVertexOfRectangle_Y){
        super();
        this.myShapeName = "Rectangle";
        this.firstVertexOfRectangle_X = firstVertexOfRectangle_X;
        this.firstVertexOfRectangle_Y = firstVertexOfRectangle_Y;
        this.secondVertexOfRectangle_X = secondVertexOfRectangle_X;
        this.secondVertexOfRectangle_Y = secondVertexOfRectangle_Y;
        this.thirdVertexOfRectangle_X = thirdVertexOfRectangle_X;
        this.thirdVertexOfRectangle_Y = thirdVertexOfRectangle_Y;
        this.fourthVertexOfRectangle_X = fourthVertexOfRectangle_X;
        this.fourthVertexOfRectangle_Y = fourthVertexOfRectangle_Y;
        validateRectangleCoordinates();
    }

    @Deprecated
    private  void validateRectangleCoordinates(){
        // Початок процедури валідації координат прямокутника
        isRectangle = true;
        double[] arrayOfSideLengths = new double[4]; // Массив сторін A, B, C, D
        // Кінець процедури валідації координат прямокутника
    }

    public double getFirstVertexOfRectangle_X() {
        return firstVertexOfRectangle_X;
    }

    public double getFirstVertexOfRectangle_Y() {
        return firstVertexOfRectangle_Y;
    }

    public double getSecondVertexOfRectangle_X() {
        return secondVertexOfRectangle_X;
    }

    public double getSecondVertexOfRectangle_Y() {
        return secondVertexOfRectangle_Y;
    }

    public double getThirdVertexOfRectangle_X() {
        return thirdVertexOfRectangle_X;
    }

    public double getThirdVertexOfRectangle_Y() {
        return thirdVertexOfRectangle_Y;
    }

    public double getFourthVertexOfRectangle_X() {
        return fourthVertexOfRectangle_X;
    }

    public double getFourthVertexOfRectangle_Y() {
        return fourthVertexOfRectangle_Y;
    }

    public void setFirstVertexOfRectangle_X(double firstVertexOfRectangle_X) {
        this.firstVertexOfRectangle_X = firstVertexOfRectangle_X;
        validateRectangleCoordinates();
    }

    public void setFirstVertexOfRectangle_Y(double firstVertexOfRectangle_Y) {
        this.firstVertexOfRectangle_Y = firstVertexOfRectangle_Y;
        validateRectangleCoordinates();
    }

    public void setSecondVertexOfRectangle_X(double secondVertexOfRectangle_X) {
        this.secondVertexOfRectangle_X = secondVertexOfRectangle_X;
        validateRectangleCoordinates();
    }

    public void setSecondVertexOfRectangle_Y(double secondVertexOfRectangle_Y) {
        this.secondVertexOfRectangle_Y = secondVertexOfRectangle_Y;
        validateRectangleCoordinates();
    }

    public void setThirdVertexOfRectangle_X(double thirdVertexOfRectangle_X) {
        this.thirdVertexOfRectangle_X = thirdVertexOfRectangle_X;
        validateRectangleCoordinates();
    }

    public void setThirdVertexOfRectangle_Y(double thirdVertexOfRectangle_Y) {
        this.thirdVertexOfRectangle_Y = thirdVertexOfRectangle_Y;
        validateRectangleCoordinates();
    }

    public void setFourthVertexOfRectangle_X(double fourthVertexOfRectangle_X) {
        this.fourthVertexOfRectangle_X = fourthVertexOfRectangle_X;
        validateRectangleCoordinates();
    }

    public void setFourthVertexOfRectangle_Y(double fourthVertexOfRectangle_Y) {
        this.fourthVertexOfRectangle_Y = fourthVertexOfRectangle_Y;
        validateRectangleCoordinates();
    }


    @Override
    public double calculateArea() {
        if ( isRectangle ){
            //return arrayOfSideLengths[0] * arrayOfSideLengths[1];
            return 1500;
        }else{
            System.out.print("Не можу порахувати! Фігура не є прямокутником! \n");
            return -1;
        }
    }

    @Override
    public double calculatePerimeter() {
        if ( isRectangle ){
            return 1000;
            //return arrayOfSideLengths[0] + arrayOfSideLengths[1] + arrayOfSideLengths[2] + arrayOfSideLengths[3];
        }else{
            System.out.print("Не можу порахувати! Фігура не є прямокутником! \n");
            return -1;
        }
    }

    @Override
    public void paint() {
        System.out.print("Малюю прямокутник... \n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.firstVertexOfRectangle_X, firstVertexOfRectangle_X) == 0 && Double.compare(rectangle.firstVertexOfRectangle_Y, firstVertexOfRectangle_Y) == 0 && Double.compare(rectangle.secondVertexOfRectangle_X, secondVertexOfRectangle_X) == 0 && Double.compare(rectangle.secondVertexOfRectangle_Y, secondVertexOfRectangle_Y) == 0 && Double.compare(rectangle.thirdVertexOfRectangle_X, thirdVertexOfRectangle_X) == 0 && Double.compare(rectangle.thirdVertexOfRectangle_Y, thirdVertexOfRectangle_Y) == 0 && Double.compare(rectangle.fourthVertexOfRectangle_X, fourthVertexOfRectangle_X) == 0 && Double.compare(rectangle.fourthVertexOfRectangle_Y, fourthVertexOfRectangle_Y) == 0 && isRectangle == rectangle.isRectangle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstVertexOfRectangle_X, firstVertexOfRectangle_Y, secondVertexOfRectangle_X, secondVertexOfRectangle_Y, thirdVertexOfRectangle_X, thirdVertexOfRectangle_Y, fourthVertexOfRectangle_X, fourthVertexOfRectangle_Y, isRectangle);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "firstVertexOfRectangle_X=" + firstVertexOfRectangle_X +
                ", firstVertexOfRectangle_Y=" + firstVertexOfRectangle_Y +
                ", secondVertexOfRectangle_X=" + secondVertexOfRectangle_X +
                ", secondVertexOfRectangle_Y=" + secondVertexOfRectangle_Y +
                ", thirdVertexOfRectangle_X=" + thirdVertexOfRectangle_X +
                ", thirdVertexOfRectangle_Y=" + thirdVertexOfRectangle_Y +
                ", fourthVertexOfRectangle_X=" + fourthVertexOfRectangle_X +
                ", fourthVertexOfRectangle_Y=" + fourthVertexOfRectangle_Y +
                ", isRectangle=" + isRectangle +
                '}';
    }
}
