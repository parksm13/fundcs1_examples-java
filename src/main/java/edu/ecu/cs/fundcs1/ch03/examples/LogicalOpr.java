// BEGIN example
// Demonstrates boolean and bitwise logical operators

package edu.ecu.cs.fundcs1.ch03.examples;

public class LogicalOpr
{
    public static void main()
    {
        int x = 5, y = 10;
        System.out.format("x = %d y = %d%n", x, y);
        // Logical-AND, Logical-OR, Logical-XOR, Logical-Negation
        System.out.format("x < 10 & y > 10 = %b%n", x < 10 & y > 10);
        System.out.format("x < 10 | y > 10 = %b%n", x < 10 | y > 10);
        System.out.format("x < 10 ^ y > 10 = %b%n", x < 10 ^ y > 10);
        System.out.format("!(x < 10) = %b%n", !(x < 10));
        // Bitwise-AND, Bitwise-OR, Bitwise-XOR, Bitwise-Negation
        System.out.format("x & y = %d%n", x & y);
        System.out.format("x | y = %d%n", x | y);
        System.out.format("x ^ y = %d%n", x ^ y);
        System.out.format("~x = %d%n", ~x);
        // Short-circuit Logical-AND and Logical-OR
        System.out.format("x > 5 && y < 10 = %b%n", x > 5 && y < 10);
        System.out.format("x < 10 || y > 10 = %b%n", x < 10 || y > 10);
    }
}
// END example