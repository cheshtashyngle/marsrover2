package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NorthTest {

    @Test
    public void rightShouldReturnSouth() {
        North north = new North();

        assertEquals(East.class, north.right().getClass());
    }
}
