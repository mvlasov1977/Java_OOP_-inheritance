package org.example;
import java.awt.Color;
import java.math.*;
public class Shape {
    /*
    Створити суперклас Shape, який буде містити в собі методи: calculateArea(), calculatePerimeter та paint().Та поле color;
     */
    public Color color;
    public double calculateArea(double[] arrayOfSideLengths){
        boolean isRegularPolygone = true;
        int itemPointer = 0;
        // Перевіряю чи полігон звичайний
        while (itemPointer < arrayOfSideLengths.length){
            if (arrayOfSideLengths[itemPointer] != arrayOfSideLengths[0]){
                isRegularPolygone = false; break;
            }
            itemPointer++;
        }
        if ( isRegularPolygone ) {
            // Розрахую площу звичайного полігону по формулі Area=(ln*ln*n/4*(tan(180/n))
            double angle = Math.toRadians(180/arrayOfSideLengths.length);
            angle = Math.tan(angle);
            return (arrayOfSideLengths[0]*arrayOfSideLengths[0]*arrayOfSideLengths.length/4*angle);
        }else{
            System.out.print("Не вмію рахувати площу незвичайного полігону \n");
            return -1;
        }
    }
    public double calculatePerimeter(double[] arrayOfSideLengths){
        // Розрахую періметр як суму сторін полігона
        double myPerimeter = 0;
        for (double itemOfSideLengths:arrayOfSideLengths) {
            myPerimeter = myPerimeter + itemOfSideLengths;
        }
        return myPerimeter;
    }
    public void paint(double[] arrayOfSideLengths){
        // початок процедура розрахунку координат для полігона
        double[][] CoordinatesForSides = new double [arrayOfSideLengths.length][arrayOfSideLengths.length];
        // кінець процедура розрахунку координат для полігона

        // fillPolygon(XpointsYpoints) щось таке для малювання
        System.out.print("Малюю полігон \n");
    }
}
