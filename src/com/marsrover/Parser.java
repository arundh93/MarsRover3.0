package com.marsrover;

public class Parser {
    public RoverCommand parseInput(char input) {
        if(input == 'L')
            return new LeftCommand();
        else
            return null;
    }
}
