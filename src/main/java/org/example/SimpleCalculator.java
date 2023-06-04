package org.example;
import org.example.Calculator;
import java.math.*;
import java.util.Objects;

public class SimpleCalculator extends Calculator{
    /*
      калькулятор має базові операції(+,-.*,/ ) ,
      регістр памяті, обчислення квадратного кореня, зміна знаку
     */
    private double memoryRegister;
    public SimpleCalculator(){
        super();
        this.myCalculatorName = "Simple";
    }

    public void setMemoryRegister(double memoryRegister) {
        this.memoryRegister = memoryRegister;
    }

    public double getMemoryRegister() {
        return memoryRegister;
    }

    public double square() throws ArithmeticException {
        try {
            displayValue = Math.sqrt(displayValue);
        } catch (ArithmeticException myException){
            displayValue = 0;
            System.out.println("Detect ArithmeticException: " + myException.getMessage() + " operation: 'square root' ");
            System.out.println("operand is: " + displayValue);
            System.out.println("\n");
        }
        return displayValue;
    }
    public double changeToOpposite(){
        displayValue = displayValue * -1;
        return displayValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleCalculator that = (SimpleCalculator) o;
        return Double.compare(that.memoryRegister, memoryRegister) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(memoryRegister);
    }

    @Override
    public String toString() {
        return "SimpleCalculator{" +
                "memoryRegister=" + memoryRegister +
                '}';
    }
}
