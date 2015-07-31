package com.marsrover;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;


public class ViewTest {
    private ByteArrayInputStream is = new ByteArrayInputStream("5 5".getBytes());
    InputStream printStreamIn;

    @Before
    public void setUpStream() {
        printStreamIn = System.in;
        System.setIn(is);
    }

    @Test
    public void shouldReturnTheCorrectInput() {
        View view = new View();

        assertEquals("5 5", view.input());
    }

    @After
    public void cleanUpStream() {
        System.setIn(printStreamIn);
    }
}