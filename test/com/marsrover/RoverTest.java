package com.marsrover;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class RoverTest {

    @Test
    public void canChangeItsOrientation() {
        Orientation roverOrientation = Mockito.mock(Orientation.class);
        int [] position = {0, 0};
        Rover rover = new Rover(roverOrientation, position);

        rover.changeOrientation('N');

        Mockito.verify(roverOrientation).changeDirection('N');
        Mockito.verify(roverOrientation).getOrientation();
    }

    @Test
    public void canMoveForward() {
        Orientation roverOrientation = Mockito.mock(Orientation.class);
        Mockito.when(roverOrientation.getOrientation()).thenReturn('N');
        int [] position = {0, 0};
        Rover rover = new Rover(roverOrientation, position);

        rover.moveForward();

        assertArrayEquals(new int[]{0, 1}, rover.getPosition());
    }
}
