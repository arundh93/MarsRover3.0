package com.marsrover;

public class Rover {

    private Orientation roverOrientation;

    public Rover(Orientation roverOrientation) {
        this.roverOrientation = roverOrientation;
    }


    public void changeOrientation(char command) {
        roverOrientation.changeDirection(command);
        roverOrientation.getOrientation();
    }
}
