package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ParserTest {

    @Test
    public void shouldParseLIntoTurnLeftCommand() {
        Parser parser = new Parser();

        assertEquals(TurnLeftCommand.class, parser.parseCommand('L').getClass());
    }

    @Test
    public void shouldParseRIntoTurnRightCommand() {
        Parser parser = new Parser();

        assertEquals(TurnRightCommand.class, parser.parseCommand('R').getClass());
    }
}
