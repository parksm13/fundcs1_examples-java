//TODO: One file in the book, had to split into two files
//TODO: Not clear how Calculator is being used here (it's in the same package)

// BEGIN example
package edu.ecu.cs.fundcs1.ch03.examples;

public class CalculatorApp
{
    public static void main()
    {
        int num1 = 10;
        int num2 = 2;
        int result;
        // Public static (i.e., class-level) methods can be accessed directly
        System.out.format("%d %% %d = %d%n", num1, num2, Calculator.mod(num1, num2));
        // Create an instance of the Calculator class using the new operator
        Calculator myCalc = new Calculator();
        // Now access public non-static methods via myCalc object reference
        result = myCalc.add(num1, num2);
        System.out.format("%d + %d = %d%n", num1, num2, result);
        System.out.format("%d + %d = %d%n", num1, num2, myCalc.add(num1, num2));
        System.out.format("%d - %d = %d%n", num1, num2, myCalc.sub(num1, num2));
        System.out.format("%d * %d = %d%n", num1, num2, myCalc.mult(num1, num2));
        System.out.format("%d / %d = %d%n", num1, num2, myCalc.div(num1, num2));
        System.out.format("%d to the power %d = %f%n", num1, num2, myCalc.power((double)num1, (double)num2));
        num1 = -2050;
        System.out.format("Absolute value of %d is: %d%n", num1, myCalc.absolute(num1));
    }
}
// END example