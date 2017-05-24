package edu.ecu.cs.fundcs1.ch03;

public class Calculator
{
    public int add (int n1, int n2)
    {
        return n1 + n2;
    }
    public int sub (int n1, int n2)
    {
        return n1 - n2;
    }
    public int mult (int n1, int n2)
    {
        return n1 * n2;
    }
    public int div (int n1, int n2)
    {
        return n1 / n2;
    }
    public static int mod (int n1, int n2)
    {
        return n1 % n2;
    }
    public double power (double baseNum, double expoNum)
    {
        return Math.pow (baseNum, expoNum);
    }
    public int absolute (int n1)
    {
        return Math.abs(n1);
    }
}