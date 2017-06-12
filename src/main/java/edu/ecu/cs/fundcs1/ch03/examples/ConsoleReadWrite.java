/*
 * Copyright (c) 2017 Venkat N. Gudivada, Jagadeesh Nandigam
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// BEGIN example
// This program demonstrates declaring and initializing variables
// and constants; assignment statement, arithmetic expression,
// and writing to and reading from console

package edu.ecu.cs.fundcs1.ch03.examples;

import java.util.Scanner;

public class ConsoleReadWrite
{
    public static void main() {
        // used to read input from the keyboard
        Scanner s = new Scanner(System.in);

        final double PI = 3.1415;
        String stdGreeting = "Hi, there!";
        int age;

        System.out.format("The Value of PI is: %.4f%n", PI);
        System.out.format("%s How Old are You?", stdGreeting);
        age = s.nextInt();
        System.out.format("%nThis Year You Are %d Years Old!", age);
        age = age + 1;
        System.out.format("%nNext Year You Will be %d Years Old!%n", age);
    }
}
// END example