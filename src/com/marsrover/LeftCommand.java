package com.marsrover;

public class LeftCommand implements RoverCommand {

    @Override
    public void execute(Rover rover) {
        rover.changeOrientation('L');
    }
}
