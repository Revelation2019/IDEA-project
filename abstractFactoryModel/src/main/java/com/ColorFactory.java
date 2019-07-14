package com;

public class ColorFactory extends AbstrctFactory {
    @Override
    public Shape getShape(String type) {
        return null;
    }

    @Override
    public Color getColor(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("red")) {
            return new Red();
        } else if (type.equalsIgnoreCase("black")) {
            new Black();
        } else if (type.equalsIgnoreCase("yellow")) {
            return new Yellow();
        }
        return null;
    }
}
