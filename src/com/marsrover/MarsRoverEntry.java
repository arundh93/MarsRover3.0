package com.marsrover;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MarsRoverEntry {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Character> directions = new ArrayList<>();
        directions.add('N');
        directions.add('E');
        directions.add('S');
        directions.add('W');
        System.out.println("Enter number of rovers");
        int noOfRovers = sc.nextInt();
        RoverCommand roverCommand;
        for(int i =0; i <= noOfRovers; i++) {
            String input = sc.nextLine();
            Orientation orientation = new Orientation('N', directions);
            Rover rover = new Rover(orientation, new int[]{1,0});
            for (int j = 0; j < input.length(); j++) {
                Parser parser = new Parser();
                roverCommand = parser.parseInput(input.charAt(j));
                roverCommand.execute(rover);
            }
            System.out.println(Arrays.toString(rover.getPosition()));
            System.out.println((rover.getOrientation()));
        }
    }
}
