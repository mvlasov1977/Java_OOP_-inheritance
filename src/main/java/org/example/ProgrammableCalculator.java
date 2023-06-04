package org.example;

import java.util.Arrays;
import java.util.Objects;

public class ProgrammableCalculator extends ScientificCalculator{
    /*
     калькулятор має базові операції(+,-.*,/ ) ,регістр памяті, обчислення квадратного кореня, зміна знаку,
     зведення до квадрату, десятковий логарифм, sin , cos,
                            10 регістрів, бажаний програмний інтерфейс .
   */
    final double[] arrayOfRegisters;
    private enum interfaceType{ WINCE, MK61 };
    private interfaceType programmingInterface;
    public ProgrammableCalculator(){
        super();
        this.myCalculatorName = "Programmable";
        this.arrayOfRegisters = new double[10];
        this.programmingInterface = interfaceType.WINCE;
    }

    public double getArrayOfRegisters(int myArrayIndex) throws ArrayIndexOutOfBoundsException {
        try {
            return arrayOfRegisters[myArrayIndex];
        } catch (ArrayIndexOutOfBoundsException myException){
            System.out.println("Detect ArrayIndexOutOfBoundsException: " + myException.getMessage() + " operation: 'reading from register' ");
            System.out.println("register index was: " + myArrayIndex + " ,allow index is 0.." + (arrayOfRegisters.length - 1) );
            System.out.println("\n");
            return 0;
        }
    }

    public void setArrayOfRegisters(int myArrayIndex) throws ArrayIndexOutOfBoundsException {
        try {
            this.arrayOfRegisters[myArrayIndex] = displayValue;
        } catch (ArrayIndexOutOfBoundsException myException){
            System.out.println("Detect ArrayIndexOutOfBoundsException: " + myException.getMessage() + " operation: 'saving to register' ");
            System.out.println("register index was: " + myArrayIndex + " ,allow index is 0.." + (arrayOfRegisters.length - 1) );
            System.out.println("\n");
        }
    }

    public interfaceType getProgrammingInterface() {
        return programmingInterface;
    }

    public void setProgrammingInterface(interfaceType programmingInterface) {
        this.programmingInterface = programmingInterface;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProgrammableCalculator that = (ProgrammableCalculator) o;
        return Arrays.equals(arrayOfRegisters, that.arrayOfRegisters) && programmingInterface == that.programmingInterface;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), programmingInterface);
        result = 31 * result + Arrays.hashCode(arrayOfRegisters);
        return result;
    }

    @Override
    public String toString() {
        return "ProgrammableCalculator{" +
                "arrayOfRegisters=" + Arrays.toString(arrayOfRegisters) +
                ", programmingInterface=" + programmingInterface +
                '}';
    }
}
