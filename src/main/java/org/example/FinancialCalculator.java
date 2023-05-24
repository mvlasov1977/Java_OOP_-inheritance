package org.example;

public class FinancialCalculator extends SimpleCalculator{
    /*
  калькулятор має базові операції(+,-.*,/ ) ,регістр памяті, обчислення квадратного кореня, зміна знаку,
                                         величина знижки
 */
    public FinancialCalculator(){
        super();
        this.myCalculatorName = "Financial";
    }
    public double discount(){ // в пам'яті процент на екрані сума
        displayValue = displayValue * getMemoryRegister() / 100;
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
