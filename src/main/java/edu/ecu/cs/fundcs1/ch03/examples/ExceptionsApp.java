// Demonstrates handling of user-defined exceptions

package edu.ecu.cs.fundcs1.ch03.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class ExceptionsApp {
    public static void main() {
        int num1, num2, result;
        String[] strArray = {"First", "Second", "Third"};
        Calculator myCalc = new Calculator();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter an (int) number");
            num1 = Integer.parseInt(in.readLine());
            System.out.print("Enter another (int) number");
            num2 = Integer.parseInt(in.readLine());
            result = myCalc.add(num1, num2);
            System.out.format("%d + %d is: %d", num1, num2, result);
            result = myCalc.div(num1, num2);
            System.out.format("%d / %d is: %d", num1, num2, result);
            System.out.format("strArray[0] is: %d", strArray[0]);
            System.out.format("strArray[3] is: %d", strArray[3]);
        } catch (ArithmeticException e) {
            System.out.println("Type: " + e.getClass().getName());
            System.out.println("Source: " + e.getCause());
            System.out.println("Message: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Type: " + e.getClass().getName());
            System.out.println("Source: " + e.getCause());
            System.out.println("Message: " + e.getMessage());
        } finally {
            System.out.format("Control always comes here");
        }
    }
}

//TODO: fundamentally changed from original, needs review and test