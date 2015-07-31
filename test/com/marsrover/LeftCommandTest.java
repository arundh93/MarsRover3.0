package com.marsrover;

import org.junit.Test;
import org.mockito.Mockito;

public class LeftCommandTest {

    @Test
    public void canPerformLeftTurnForRover() {
        LeftCommand leftCommand = new LeftCommand();
        Rover rover = Mockito.mock(Rover.class);

        leftCommand.execute(rover);

        Mockito.verify(rover).changeOrientation('L');
    }

}
