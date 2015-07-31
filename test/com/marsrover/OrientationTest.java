package com.marsrover;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class OrientationTest {

    @Test
    public void canChangeOrientation() {
        ArrayList<Character> directions = new ArrayList<>();
        directions.add('N');
        directions.add('E');
        directions.add('S');
        directions.add('W');
        Orientation orientation = new Orientation('N',directions);

        orientation.changeOrientation('L');

        assertEquals('W', orientation.getOrientation());
    }
}
