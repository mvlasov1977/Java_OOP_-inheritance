package org.example;

public class Calculator {
    /*
      реалізувати сімейство калькуляторів (Простий, Фінансовий, Бухгалтерський) Інженерний, Програмований)
      всі вони повинні вміти виконувати базові операції(+,-.*,/ ) плюс свої специфічні функції;
      має базові операції(+,-.*,/ )
     */

    // Створюю методи
    public String myCalculatorName;
    public double displayValue;
    private double firstOperand;
    private double secondOperand;
    public Calculator(){
        this.myCalculatorName = "Аріфмометер";
    }

    public void setFirstOperand(double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public void setSecondOperand(double secondOperand) {
        this.secondOperand = secondOperand;
    }

    public double getFirstOperand() {
        return firstOperand;
    }

    public double getSecondOperand() {
        return secondOperand;
    }

    public double addition(){
        displayValue = firstOperand + secondOperand;
        return displayValue;
    }
    public double substraction() {
        displayValue = firstOperand - secondOperand;
        return displayValue;
    }
    public double multiplication(){
        displayValue = firstOperand * secondOperand;
        return displayValue;
    }
    public double division() throws ArithmeticException {
        try {
            displayValue = firstOperand / secondOperand;
        }catch (ArithmeticException myException){
            displayValue = 0;
            System.out.println("Detect ArithmeticException: " + myException.getMessage() + " operation: 'division' ");
            System.out.println("first operand is: " + firstOperand);
            System.out.println("second operand is: " + secondOperand);
            System.out.println("\n");
        }
        return displayValue;
    }
}
