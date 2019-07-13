package com;

public interface ShapeFactoryInterface{
    /**
     *
     * @return 返回一个Shape对象
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    Shape getShape() throws IllegalAccessException,InstantiationException;
}
