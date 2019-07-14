package com;

public class ShapeFactory extends AbstrctFactory {
    @Override
    public Shape getShape(String type) throws IllegalAccessException, InstantiationException {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("square")) {
            return Square.class.newInstance();
        } else if (type.equalsIgnoreCase("circle")) {
            return Circle.class.newInstance();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return Rectangle.class.newInstance();
        }
        return null;
    }

    @Override
    public Color getColor(String type) {
        return null;
    }
}
