package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NorthTest {

    @Test
    public void rightShouldReturnEast() {
        North north = new North();

        assertEquals(East.class, north.right().getClass());
    }

    @Test
    public void leftShouldReturnWest() {
        North north = new North();

        assertEquals(West.class, north.left().getClass());
    }
}
