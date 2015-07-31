package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WestTest {

    @Test
    public void rightShouldReturnSouth() {
        West west = new West();

        assertEquals(North.class, west.right().getClass());
    }

    @Test
    public void leftShouldReturnNorth() {
        West west = new West();

        assertEquals(South.class, west.left().getClass());
    }

}
