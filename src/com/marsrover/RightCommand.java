package com.marsrover;

public class RightCommand implements RoverCommand {

    @Override
    public void execute(Rover rover) {
        rover.changeOrientation('R');
    }
}
