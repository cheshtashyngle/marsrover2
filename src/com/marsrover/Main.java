package com.marsrover;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        String input = view.input();
        String[] inputs = input.split(" ");
        int xCoordinate = Integer.parseInt(inputs[0]);
        int yCoordinate = Integer.parseInt(inputs[1]);
        int[] plateau = {xCoordinate, yCoordinate};
    }
}
