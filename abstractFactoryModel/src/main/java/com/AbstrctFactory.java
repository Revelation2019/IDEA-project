package com;

public abstract class AbstrctFactory {
    public abstract Shape getShape(String type) throws IllegalAccessException,InstantiationException;

    public abstract Color getColor(String type) throws IllegalAccessException,InstantiationException;
}
