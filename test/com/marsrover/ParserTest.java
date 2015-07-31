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
}
