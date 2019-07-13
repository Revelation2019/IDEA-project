package com;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        CircleFactory circleFactory = new CircleFactory();
        SquareFactory squareFactory = new SquareFactory();
        try {
            circleFactory.getShape().draw();
            squareFactory.getShape().draw();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
