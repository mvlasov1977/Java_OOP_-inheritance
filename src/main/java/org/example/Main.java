package org.example;

public class Main {
    /*
    В класі main створити масив з обєктами фігур
    В циклі викликати методи цих фігур
     */
    public static void main(String[] args) {
        // створюю фігури
        Shape[] arrayOfShapes = new Shape [3];
        arrayOfShapes[0] = new Circle(0, 0,10);

        arrayOfShapes[1] = new Rectangle(1,4,
                                       7,4,7,
                                         1,1,1);
        arrayOfShapes[2] = new Triangle(1,1,
                                      3,1,
                                        5,1);
        for (Shape myShape:arrayOfShapes){
            System.out.println(myShape.calculatePerimeter());
            System.out.println(myShape.calculateArea());
            myShape.paint();
        }
        System.out.println("\n");
    }
}