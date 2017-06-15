package edu.ecu.cs.fundcs1.ch04.examples;

public class Enums1 {

    enum StudentType
    {
        FRESHMAN,
        SOPHOMORE,
        JUNIOR,
        SENIOR
    }

    public static void greeting (StudentType stdType)
    {
        switch (stdType)
        {
            case FRESHMAN:
                System.out.println("You are just out of high school");
                break;
            case SOPHOMORE:
                System.out.println("You just finished learning college ropes");
                break;
            case JUNIOR:
                System.out.println("You started your initial descent to the real-world");
                break;
            case SENIOR:
                System.out.println("Welcome to the world of rat race and ravenous wolves");
                break;
        }
    }

    public static void main()
    {
        StudentType st1 = StudentType.FRESHMAN;
        greeting(st1);
        st1 = StudentType.SOPHOMORE;
        greeting(st1);
        st1 = StudentType.JUNIOR;
        greeting(st1);
        st1 = StudentType.SENIOR;
        greeting(st1);
    }
}

//TODO: needs review and tests