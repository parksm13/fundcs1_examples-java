package edu.ecu.cs.fundcs1.ch04.examples;

class Arrays1
{
    public static void main()
    {
        // Declares and initializes an int array of five elements
        int[] intArray = new int[] {10, 20, 30, 40, 50};
        // A long array declaration and instance creation
        long[] lngArray = new long[4];
        // Declares an array of type float
        float[] prices1 = {29.6F, 36.2F, 11.3F};
        // Declares and initializes a float array of three elements
        float[] prices2 = {29.6F, 36.2F, 11.3F};
        // Shorthand for declaration, creation, and initialization
        float[] prices3 = {29.6F, 36.2F, 11.3F};
        // A 4-element array of Strings
        String[] stdClass = new String[]{"Fresh","Sopho","Junior","Senior"};
        // Declares and creates an instance of issuers
        String[] issuers = new String[4];
        // Initialization of array elements
        issuers[2] = "Sun";
        issuers[3] = "Microsoft";
        // Two-dim array, 2 rows and 3 columns
        int[][] intTwoD = {{11, 12, 13},{21, 22, 23}};
        System.out.format("intArray[0]: %d lngArray[3]: %d", intArray[0], lngArray[3]);
        System.out.format("prices1[2]: {0:F2} stdClass[0]: %d", prices1[2], stdClass[0]);
        System.out.format("issuers[3]: %d intTwoD[1,2]: %d", issuers[3], intTwoD[1][2]);
    }
}

//TODO: needs review and tests