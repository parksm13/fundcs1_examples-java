// Demonstrates various forms of the assignment operator

package edu.ecu.cs.fundcs1.ch03.examples;

public class AssignmentOprApp {
        public static void main()
        {
            int x = 10;
            System.out.format("x = %d", x);
            x += 5;
            // x = x + 5
            x -= 10;
            // x = x - 10
            x *= 4;
            // x = x * 4
            x /= 2;
            // x = x / 2
            x %= 3;
            // x = x % 3
            System.out.format("x = %d", x);
            x <<= 4;
            // x = x << 4
            x >>= 2;
            // x = x >> 2
            System.out.format("x = %d", x);
            x &= 10;
            // x = x & 10
            x |= 10;
            // x = x | 10
            x ^= 8;
            // x = x ^ 8
            System.out.format("x = %d", x);
        }
    }