package com.marsrover;

import org.junit.Test;
import org.mockito.Mockito;


public class RoverTest {

    @Test
    public void canChangeItsOrientation() {
        Orientation roverOrientation = Mockito.mock(Orientation.class);
        Rover rover = new Rover(roverOrientation);

        rover.changeOrientation('N');

        Mockito.verify(roverOrientation).changeDirection('N');
        Mockito.verify(roverOrientation).getOrientation();
    }
}
