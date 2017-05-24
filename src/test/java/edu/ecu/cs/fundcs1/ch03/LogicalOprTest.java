package edu.ecu.cs.fundcs1.ch03;

import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class LogicalOprTest {

    // used to test console output from main method in another class
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeClass
    public static void beginLogicalOprTestOutput() {
        System.out.format("%nBEGIN LogicalOprTest" +
                          System.lineSeparator() +
                          "====================" +
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
        System.out.println("==================" +
                           System.lineSeparator() +
                           "END LogicalOprTest" +
                           System.lineSeparator());
    }

    @Test
    public void testLogicalOprMain() {
        LogicalOpr.main();
        String result = "x = 5 y = 10" +
                        System.lineSeparator() +
                        "x < 10 & y > 10 = false" +
                        System.lineSeparator() +
                        "x < 10 | y > 10 = true" +
                        System.lineSeparator() +
                        "x < 10 ^ y > 10 = true" +
                        System.lineSeparator() +
                        "!(x < 10) = false" +
                        System.lineSeparator() +
                        "x & y = 0" +
                        System.lineSeparator() +
                        "x | y = 15" +
                        System.lineSeparator() +
                        "x ^ y = 15" +
                        System.lineSeparator() +
                        "~x = -6" +
                        System.lineSeparator() +
                        "x > 5 && y < 10 = false" +
                        System.lineSeparator() +
                        "x < 10 || y > 10 = true" +
                        System.lineSeparator();
        assertEquals(result, outContent.toString());
    }
}
