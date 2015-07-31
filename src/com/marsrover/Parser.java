package com.marsrover;

public class Parser {

    public Command parseCommand(char command) {
        if(command == 'L')
            return new TurnLeftCommand();
        else
            return new TurnRightCommand();
    }
}
