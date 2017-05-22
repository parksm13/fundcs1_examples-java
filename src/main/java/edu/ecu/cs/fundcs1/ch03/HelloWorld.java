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

/*
 * New Concepts:
 * =============
 * Declaring a package
 * Importing a class from the Java Standard Library
 * Declaring a new class
 * Access modifiers
 * Declaring a new function
 * Function return types
 * Writing to the console/terminal/command line
 * Function arguments
 * Code formatting (indents/bracing)
 *
 * New Terminology:
 * ================
 * package
 * keyword
 * class/instance
 * declare/define
 * function/method/procedure/subroutine
 *
 * New Java Keywords:
 * ==================
 * package
 * import
 * class
 * public
 * static
 * void
 *
 * New Java Library Items:
 * =======================
 * java.lang
 * System
 * System.out.println(String)
 */

//TODO: Should package declaration be included in the example?
//TODO: Is this example too large?

package edu.ecu.cs.fundcs1.ch03;

import java.lang.System;

public class HelloWorld {
    public static void main() {
        System.out.println("Hello, World!");
    }
}
