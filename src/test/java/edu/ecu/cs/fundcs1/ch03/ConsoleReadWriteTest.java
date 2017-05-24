package edu.ecu.cs.fundcs1.ch03;

import org.junit.*;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

import java.io.*;

public class ConsoleReadWriteTest {

    // used to test console output from main method in another class
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    @BeforeClass
    public static void beginConsoleReadWriteTestOutput() {
        System.out.format("%nBEGIN ConsoleReadWriteTest" +
                          System.lineSeparator() +
                          "==========================" +
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
    public static void endConsoleReadWriteTestOutput() {
        System.out.println("========================" +
                           System.lineSeparator() +
                           "END ConsoleReadWriteTest" +
                           System.lineSeparator());
    }

    @Test
    public void testConsoleReadWriteMain() {
        Integer input = 37;
        systemInMock.provideLines(input.toString());
        ConsoleReadWrite.main();
        String result = "The Value of PI is: 3.1415" +
                        System.lineSeparator() +
                        "Hi, there! How Old are You?" +
                        System.lineSeparator() +
                        "This Year You Are " +
                        input.toString() +
                        " Years Old!" +
                        System.lineSeparator() +
                        "Next Year You Will be " +
                        Integer.toString(input + 1) +
                        " Years Old!" +
                        System.lineSeparator();
        assertEquals(result, outContent.toString());
    }
}
