package org.example;
import java.awt.Color;
import java.math.*;
public abstract class Shape {
    /*
    Створити суперклас Shape, який буде містити в собі методи: calculateArea(), calculatePerimeter та paint().Та поле color;
     */

    public String myShapeName;
    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract void paint();
}
