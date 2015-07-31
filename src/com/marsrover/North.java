package com.marsrover;

public class North implements Direction {

    @Override
    public Direction right() {
        return new East();
    }

    @Override
    public Direction left() {
        return new West();
    }
}
