package com.marsrover;

public class Parser {

    public Command parseCommand(char command) {
        if(command == 'L')
            return new TurnLeftCommand();
        else if(command == 'R')
            return new TurnRightCommand();
        else if(command == 'M')
            return new MoveCommand();
        else
            return null;
    }
}
