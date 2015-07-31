package com.marsrover;

public class West implements Direction {

    @Override
    public Direction right() {
        return new North();
    }

    @Override
    public Direction left() {
        return null;
    }
}
