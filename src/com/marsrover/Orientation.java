package com.marsrover;

import java.util.ArrayList;

public class Orientation {

    private char currentOrientation;
    private ArrayList<Character> directions;
    private int indexOfOrientation;

    public Orientation(char currentOrientation, ArrayList<Character> directions) {
        this.currentOrientation = currentOrientation;
        this.directions = directions;
        indexOfOrientation = directions.indexOf(currentOrientation);
    }

    public void changeOrientation(char command) {
        if (command == 'L') {
            indexOfOrientation--;
            if(indexOfOrientation < 0)
                indexOfOrientation = 3;
            currentOrientation = directions.get(indexOfOrientation);
        }
    }

    public char getOrientation() {
        return currentOrientation;
    }
}
