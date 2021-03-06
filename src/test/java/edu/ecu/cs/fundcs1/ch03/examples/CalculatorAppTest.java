package edu.ecu.cs.fundcs1.ch03.examples;

import edu.ecu.cs.fundcs1.ch03.examples.CalculatorApp;
import org.junit.*;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class CalculatorAppTest {

    // used to test console output from main method in another class
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeClass
    public static void beginCalculatorAppTestOutput() {
        System.out.format("%nBEGIN CalculatorAppTest" +
                          System.lineSeparator() +
                          "=======================" +
                          System.lineSeparator());
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        System.out.print(outContent.toString());
    }

    @AfterClass
    public static void endHelloWorldTestOutput() {
        System.out.println("=====================" +
                           System.lineSeparator() +
                           "END CalculatorAppTest" +
                           System.lineSeparator());
    }

    @Test
    public void testCalculatorAppMain() {
        CalculatorApp.main();
        String result = "10 % 2 = 0" +
                        System.lineSeparator() +
                        "10 + 2 = 12" +
                        System.lineSeparator() +
                        "10 + 2 = 12" +
                        System.lineSeparator() +
                        "10 - 2 = 8" +
                        System.lineSeparator() +
                        "10 * 2 = 20" +
                        System.lineSeparator() +
                        "10 / 2 = 5" +
                        System.lineSeparator() +
                        "10 to the power 2 = 100.000000" +
                        System.lineSeparator() +
                        "Absolute value of -2050 is: 2050" +
                        System.lineSeparator();
        assertEquals(result, outContent.toString());
    }
}