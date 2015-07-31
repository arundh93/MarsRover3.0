package com.marsrover;

public class Parser {
    public RoverCommand parseInput(char input) {
        if(input == 'L')
            return new LeftCommand();
        else  if(input == 'R')
            return new RightCommand();
        else
            return new MoveForwardCommand();
    }
}
