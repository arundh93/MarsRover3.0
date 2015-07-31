package com.marsrover;

public class Rover {

    private Orientation roverOrientation;
    private int [] position;

    public Rover(Orientation roverOrientation, int[] position) {
        this.roverOrientation = roverOrientation;
        this.position = position;
    }


    public void changeOrientation(char command) {
        roverOrientation.changeDirection(command);
        getOrientation();
    }

    public char getOrientation() {
        return roverOrientation.getOrientation();
    }

    public int [] getPosition() {
        return position;
    }

    public void moveForward() {
        switch(roverOrientation.getOrientation()) {
            case 'N':
                position[1]++;
                break;

            case 'E':
                position[0]++;
                break;

            case 'S':
                position[1]--;
                break;

            case 'W':
                position[0]--;
        }
    }
}
