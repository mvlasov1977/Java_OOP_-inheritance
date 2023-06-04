package org.example;
import java.math.*;
public class ScientificCalculator extends SimpleCalculator {
    /*
     калькулятор має базові операції(+,-.*,/ ) ,регістр памяті, обчислення квадратного кореня, зміна знаку,
                           зведення до квадрату, десятковий логарифм, sin , cos
     */
    static enum cornerType{RAD, GRAD};
    public ScientificCalculator(){
        super();
        this.myCalculatorName = "Scientific";
    }
    public double squaring(){
        displayValue = displayValue * displayValue;
        return displayValue;
    }
    public double log10() throws ArithmeticException{
        try {
            displayValue = Math.log10(displayValue);
        }catch (ArithmeticException myException){
            displayValue = 0;
            System.out.println("Detect ArithmeticException: " + myException.getMessage() + " operation: 'decimal logarithm' ");
            System.out.println("operand is: " + displayValue);
            System.out.println("\n");
        }
        return displayValue;
    }
    public double sin(cornerType myCornerType){
        if ( myCornerType.equals( cornerType.RAD ) ) {
            displayValue = Math.sin( displayValue );
        }
        if ( myCornerType.equals( cornerType.GRAD ) ){ // конверт у радіани
            displayValue = Math.sin( Math.PI * displayValue / 180 );
        }
        return displayValue;
    }
    public double cos(cornerType myCornerType){
        if ( myCornerType.equals( cornerType.RAD ) ) {
            displayValue = Math.cos( displayValue );
        }
        if ( myCornerType.equals( cornerType.GRAD ) ){ // конверт у радіани
            displayValue = Math.cos( Math.PI * displayValue / 180 );
        }
        return displayValue;
   }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}