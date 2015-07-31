package com.marsrover;

public class East implements Direction {

    @Override
    public Direction right() {
        return new South();
    }

    @Override
    public Direction left() {
        return new North();
    }
}
