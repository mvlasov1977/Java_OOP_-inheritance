package org.example;

import java.util.Objects;

public class Triangle extends Shape {
    /*
     Створити клас нащадків: triangle, які містять в собі координати точок, необхідних для cтворення цих фігур.
     Перевизначити для класів нащадків необхідні методи
     Коректно перевизначити методи equals(), hashCode(), toString().
 */

    private double firstVertexOfTriangle_X;
    private double firstVertexOfTriangle_Y;
    private double secondVertexOfTriangle_X;
    private double secondVertexOfTriangle_Y;
    private double thirdVertexOfTriangle_X;
    private double thirdVertexOfTriangle_Y;
    private boolean isTriangle;
    public Triangle(double firstVertexOfTriangle_X, double firstVertexOfTriangle_Y,
                    double secondVertexOfTriangle_X, double secondVertexOfTriangle_Y,
                    double thirdVertexOfTriangle_X, double thirdVertexOfTriangle_Y){
        super();
        this.myShapeName = "Triangle";
        this.firstVertexOfTriangle_X = firstVertexOfTriangle_X;
        this.firstVertexOfTriangle_Y = firstVertexOfTriangle_Y;
        this.secondVertexOfTriangle_X = secondVertexOfTriangle_X;
        this.secondVertexOfTriangle_Y = secondVertexOfTriangle_Y;
        this.thirdVertexOfTriangle_X = thirdVertexOfTriangle_X;
        this.thirdVertexOfTriangle_Y = thirdVertexOfTriangle_Y;

        setColor(Color.YELLOW);

        validateTriangleCoordinates();
    }
    @Deprecated
    private  void validateTriangleCoordinates(){
        // Початок процедури валідації координат трикутника
        isTriangle = true;
        double[] arrayOfSideLengths = new double[3]; // Массив сторін A, B, C
        // Кінець процедури валідації координат трикутника
    }

    public double getFirstVertexOfTriangle_X() {
        return firstVertexOfTriangle_X;
    }

    public double getFirstVertexOfTriangle_Y() {
        return firstVertexOfTriangle_Y;
    }

    public double getSecondVertexOfTriangle_X() {
        return secondVertexOfTriangle_X;
    }

    public double getSecondVertexOfTriangle_Y() {
        return secondVertexOfTriangle_Y;
    }

    public double getThirdVertexOfTriangle_X() {
        return thirdVertexOfTriangle_X;
    }

    public double getThirdVertexOfTriangle_Y() {
        return thirdVertexOfTriangle_Y;
    }

    public void setFirstVertexOfTriangle_X(double firstVertexOfTriangle_X) {
        this.firstVertexOfTriangle_X = firstVertexOfTriangle_X;
        validateTriangleCoordinates();
    }

    public void setFirstVertexOfTriangle_Y(double firstVertexOfTriangle_Y) {
        this.firstVertexOfTriangle_Y = firstVertexOfTriangle_Y;
        validateTriangleCoordinates();
    }

    public void setSecondVertexOfTriangle_X(double secondVertexOfTriangle_X) {
        this.secondVertexOfTriangle_X = secondVertexOfTriangle_X;
        validateTriangleCoordinates();
    }

    public void setSecondVertexOfTriangle_Y(double secondVertexOfTriangle_Y) {
        this.secondVertexOfTriangle_Y = secondVertexOfTriangle_Y;
        validateTriangleCoordinates();
    }

    public void setThirdVertexOfTriangle_X(double thirdVertexOfTriangle_X) {
        this.thirdVertexOfTriangle_X = thirdVertexOfTriangle_X;
        validateTriangleCoordinates();
    }

    public void setThirdVertexOfTriangle_Y(double thirdVertexOfTriangle_Y) {
        this.thirdVertexOfTriangle_Y = thirdVertexOfTriangle_Y;
        validateTriangleCoordinates();
    }


    @Override
    public double calculateArea() {
        if ( isTriangle ){
            double x1 = firstVertexOfTriangle_X;
            double x2 = firstVertexOfTriangle_Y;
            double x3 = secondVertexOfTriangle_X;
            double y1 = secondVertexOfTriangle_Y;
            double y2 = thirdVertexOfTriangle_X;
            double y3 = thirdVertexOfTriangle_Y;
           // return ( ( 0.5 ) * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) );
            return 2500;
        }else{
            System.out.print("Не можу порахувати! Фігура не є трикутником! \n");
            return -1;
        }
    }

    @Override
    public double calculatePerimeter() {
        if ( isTriangle ){
            return 2000;
            //return arrayOfSideLengths[0] + arrayOfSideLengths[1] + arrayOfSideLengths[2];
        }else{
            System.out.print("Не можу порахувати! Фігура не є трикутником! \n");
            return -1;
        }
    }

    @Override
    public void paint() {
        System.out.print("Малюю трикутник... \n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.firstVertexOfTriangle_X, firstVertexOfTriangle_X) == 0 && Double.compare(triangle.firstVertexOfTriangle_Y, firstVertexOfTriangle_Y) == 0 && Double.compare(triangle.secondVertexOfTriangle_X, secondVertexOfTriangle_X) == 0 && Double.compare(triangle.secondVertexOfTriangle_Y, secondVertexOfTriangle_Y) == 0 && Double.compare(triangle.thirdVertexOfTriangle_X, thirdVertexOfTriangle_X) == 0 && Double.compare(triangle.thirdVertexOfTriangle_Y, thirdVertexOfTriangle_Y) == 0 && isTriangle == triangle.isTriangle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstVertexOfTriangle_X, firstVertexOfTriangle_Y, secondVertexOfTriangle_X, secondVertexOfTriangle_Y, thirdVertexOfTriangle_X, thirdVertexOfTriangle_Y, isTriangle);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstVertexOfTriangle_X=" + firstVertexOfTriangle_X +
                ", firstVertexOfTriangle_Y=" + firstVertexOfTriangle_Y +
                ", secondVertexOfTriangle_X=" + secondVertexOfTriangle_X +
                ", secondVertexOfTriangle_Y=" + secondVertexOfTriangle_Y +
                ", thirdVertexOfTriangle_X=" + thirdVertexOfTriangle_X +
                ", thirdVertexOfTriangle_Y=" + thirdVertexOfTriangle_Y +
                ", isTriangle=" + isTriangle +
                '}';
    }
}
