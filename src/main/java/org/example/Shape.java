package org.example;
import java.awt.Color;
import java.math.*;
public class Shape {
    /*
    Створити суперклас Shape, який буде містити в собі методи: calculateArea(), calculatePerimeter та paint().Та поле color;
     */

    public String myShapeName;
    private Color color;
    public double[] arrayOfSideLengths;
    public Shape(){
        Color color = new Color(255); // default Color
        this.myShapeName = "Polygon";
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public double calculateArea(){
        boolean isRegularPolygone = true;
        int itemPointer = 0;
        // Перевіряю чи полігон звичайний
        while ( itemPointer < this.arrayOfSideLengths.length ){
            if ( this.arrayOfSideLengths[itemPointer] != this.arrayOfSideLengths[0] ){
                isRegularPolygone = false; break;
            }
            itemPointer++;
        }
        if ( isRegularPolygone ) {
            // Розрахую площу звичайного полігону по формулі Area=(ln*ln*n/4*(tan(180/n))
            double angle =  Math.toRadians( 180 / this.arrayOfSideLengths.length );
            angle = Math.tan(angle);
            return ( this.arrayOfSideLengths[0] * this.arrayOfSideLengths[0] * this.arrayOfSideLengths.length / 4 * angle );
        }else{
            System.out.print("Не вмію рахувати площу незвичайного полігону \n");
            return -1;
        }
    }
    public double calculatePerimeter(){
        // Розрахую періметр як суму сторін полігона
        double myPerimeter = 0;
        for ( double itemOfSideLengths:this.arrayOfSideLengths ) {
            myPerimeter = myPerimeter + itemOfSideLengths;
        }
        return myPerimeter;
    }
    public void paint(){
        // початок процедура розрахунку координат для полігона
        double[][] CoordinatesForSides = new double [this.arrayOfSideLengths.length][this.arrayOfSideLengths.length];
        // кінець процедура розрахунку координат для полігона

        // fillPolygon(XpointsYpoints) щось таке для малювання
        System.out.print("Малюю полігон... \n");
    }
}
