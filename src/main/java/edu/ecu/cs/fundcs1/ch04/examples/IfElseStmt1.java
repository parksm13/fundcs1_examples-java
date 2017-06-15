package edu.ecu.cs.fundcs1.ch04.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class IfElseStmt1
{
    public static char letterGrade(int myScore)
    {
        if (myScore >= 90)
            return 'A';
        else if (myScore >= 80)
            return 'B';
        else if (myScore >= 70)
            return 'C';
        else if (myScore >= 60)
            return 'D';
        else
            return 'F';
    }

    public static void main()
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String tmpStr;
        int score;
        System.out.println("This program computes letter grade given");
        System.out.println("a test score (non-negative integer number)");
        System.out.println();
        System.out.println("Enter your score");
        try {
            tmpStr = in.readLine();
            while (!tmpStr.equals(""))
            {
                score = Integer.parseInt(tmpStr);
                System.out.format("Letter grade for score: %d is: %c", score, letterGrade(score));
                System.out.println("Enter another score. Press Enter key to end");
                tmpStr = in.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

//TODO: fundamentally altered, needs review and tests