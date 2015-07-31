package com.marsrover;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class RightCommandTest {

    @Test
    public void canPerformLeftTurnForRover() {
        RightCommand rightCommand = new RightCommand();
        Rover rover = Mockito.mock(Rover.class);

        rightCommand.execute(rover);

        Mockito.verify(rover).changeOrientation('R');
    }

}