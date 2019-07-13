package com;

public class CircleFactory implements ShapeFactoryInterface{
    @Override
    public Shape getShape() throws InstantiationException,IllegalAccessException{
        return Circle.class.newInstance();
    }
}
