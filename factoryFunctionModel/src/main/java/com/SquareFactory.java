package com;

public class SquareFactory implements ShapeFactoryInterface {
    @Override
    public Shape getShape() throws IllegalAccessException, InstantiationException {
        return Square.class.newInstance();
    }
}
