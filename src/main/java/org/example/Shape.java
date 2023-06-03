package org.example;
public abstract class Shape {
    /*
    Створити суперклас Shape, який буде містити в собі методи: calculateArea(), calculatePerimeter та paint().Та поле color;

      -- Переробити клас Shape з дз 7, щоб він містив колір в форматы нашого нового Enum Color
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
