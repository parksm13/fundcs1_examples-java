package edu.ecu.cs.fundcs1.ch03;

import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MiscOprTest {

    // used to test console output from main method in another class
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeClass
    public static void beginMiscOprTestOutput() {
        System.out.format("%nBEGIN MiscOprTest" +
                          System.lineSeparator() +
                          "=================" +
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
        System.out.println("===============" +
                           System.lineSeparator() +
                           "END MiscOprTest" +
                           System.lineSeparator());
    }

    @Test
    public void testMiscOprMain() {
        MiscOpr.main();
        String result = "x = 10" +
                        System.lineSeparator() +
                        "x = 10" +
                        System.lineSeparator() +
                        "x = 11 y = 22" +
                        System.lineSeparator() +
                        "x = 12 y = 22" +
                        System.lineSeparator() +
                        "x = 48" +
                        System.lineSeparator() +
                        "x = 48 y = 144" +
                        System.lineSeparator();
        assertEquals(result, outContent.toString());
    }
}