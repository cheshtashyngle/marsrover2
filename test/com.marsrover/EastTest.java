package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EastTest {

    @Test
    public void rightShouldReturnSouth() {
        East east = new East();

        assertEquals(South.class, east.right().getClass());
    }

    @Test
    public void leftShouldReturnNorth() {
        East east = new East();

        assertEquals(North.class, east.left().getClass());
    }
}
