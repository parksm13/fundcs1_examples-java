package edu.ecu.cs.fundcs1.ch03;

import org.junit.*;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    // used to test console output from main method in another class
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeClass
    public static void beginHelloWorldTestOutput() {
        System.out.format("%nBEGIN HelloWorldTest" +
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
                           "END HelloWorldTest" +
                           System.lineSeparator());
    }

    @Test
    public void testHelloWorldMain() {
        HelloWorld.main();
        assertEquals("Hello, World!" + System.lineSeparator(),
                     outContent.toString());
    }

}