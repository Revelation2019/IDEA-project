package com;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AbstrctFactory abstrctFactory = FactoryProducer.getFactory("shape");
        try {
            //获取形状为 Square 的对象，调用 Square 的 draw 方法
            abstrctFactory.getShape("square").draw();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        AbstrctFactory colorFactory = FactoryProducer.getFactory("color");
        try {
            //获取颜色为 Red 的对象，调用 Red 的 fill 方法
            colorFactory.getColor("red").fill();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
