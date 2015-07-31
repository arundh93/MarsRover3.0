package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ParserTest {

    @Test
    public void canCreateLeftCommand() {
        Parser parser = new Parser();
        char input = 'L';

        assertEquals(LeftCommand.class, parser.parseInput(input).getClass());
    }

    @Test
    public void canCreateRightCommand() {
        Parser parser = new Parser();
        char input = 'R';

        assertEquals(RightCommand.class, parser.parseInput(input).getClass());
    }

    @Test
    public void canCreateMoveForwardCommand() {
        Parser parser = new Parser();
        char input = 'M';

        assertEquals(MoveForwardCommand.class, parser.parseInput(input).getClass());
    }
}
