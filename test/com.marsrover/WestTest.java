package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WestTest {

    @Test
    public void rightShouldReturnNorth() {
        West west = new West();

        assertEquals(North.class, west.right().getClass());
    }

    @Test
    public void leftShouldReturnSouth() {
        West west = new West();

        assertEquals(South.class, west.left().getClass());
    }

}
