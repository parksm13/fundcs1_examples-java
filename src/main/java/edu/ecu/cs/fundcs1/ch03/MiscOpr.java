package edu.ecu.cs.fundcs1.ch03;

public class MiscOpr
{
    public static void main()
    {
        int x = 10, y = 5;
        System.out.format("x = %d%n", x);
        // increment and decrement operators
        x++;
        ++x;
        x--;
        --x;
        System.out.format("x = %d%n", x);
        y = ++x * 2;
        System.out.format("x = %d y = %d%n", x, y);
        y = x++ * 2;
        System.out.format("x = %d y = %d%n", x, y);
        // shift operators
        x = x << 4;
        x = x >> 2;
        System.out.format("x = %d%n", x);
        // conditional operator
        y = x < 10 ? x * 2 : x * 3;
        System.out.format("x = %d y = %d%n", x, y);
    }
}