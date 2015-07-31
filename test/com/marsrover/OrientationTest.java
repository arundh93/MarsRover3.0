package com.marsrover;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class OrientationTest {

    @Test
    public void canChangeOrientationForLeftCommand() {
        ArrayList<Character> directions = new ArrayList<>();
        directions.add('N');
        directions.add('E');
        directions.add('S');
        directions.add('W');
        Orientation orientation = new Orientation('N',directions);

        orientation.changeDirection('L');

        assertEquals('W', orientation.getOrientation());
    }

    @Test
    public void canChangeOrientationForRightCommand() {
        ArrayList<Character> directions = new ArrayList<>();
        directions.add('N');
        directions.add('E');
        directions.add('S');
        directions.add('W');
        Orientation orientation = new Orientation('N',directions);

        orientation.changeDirection('R');

        assertEquals('E', orientation.getOrientation());
    }
}
