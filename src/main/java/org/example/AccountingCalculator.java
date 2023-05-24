package org.example;

public class AccountingCalculator extends FinancialCalculator{
    /*
     калькулятор має базові операції(+,-.*,/ ) ,регістр памяті, обчислення квадратного кореня, зміна знаку, величина знижки,
                                       операція Cost-Sell-Margin
   */
    public AccountingCalculator(){
        super();
        this.myCalculatorName = "Accounting";
    }
    public double cost(){ // Sell-Margin відповідно у firstOperand й secondOperand
        displayValue = getFirstOperand() - getSecondOperand();
        return displayValue;
    }
    public double sell(){ // Cost-Margin відповідно у firstOperand й secondOperand
        displayValue = getFirstOperand() + getSecondOperand();
        return displayValue;
    }
    public double margin(){ // Cost-Sell відповідно у firstOperand й secondOperand
        displayValue = getSecondOperand() - getFirstOperand();
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
