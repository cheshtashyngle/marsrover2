package com.marsrover;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        String input = view.input();
        String[] inputs = input.split(" ");
        int upperXCoordinate = Integer.parseInt(inputs[0]);
        int upperYCoordinate = Integer.parseInt(inputs[1]);
        int[] plateau = {upperXCoordinate, upperYCoordinate};
        input = view.input();
        inputs = input.split(" ");
        int xCoordinate = Integer.parseInt(inputs[0]);
        int yCoordinate = Integer.parseInt(inputs[1]);
        char direction = inputs[2].charAt(0);
        new Rover(xCoordinate, yCoordinate, direction);
        input = view.input();
        inputs = input.split(" ");
        for(int i = 0;i < inputs.length;i++) {
            String command = inputs[i];
        }
    }
}
