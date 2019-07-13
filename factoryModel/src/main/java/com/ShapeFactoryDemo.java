package com;

/**
 * @author zhousheng
 * @date 2019/7/13
 *
 */
public class ShapeFactoryDemo
{
    public static void main( String[] args )
    {
        //画一个正方形
        ShapeFactory.getShape("Square").draw();
        //画一个圆
        ShapeFactory.getShape("Circle").draw();
        //画一个三角形
        ShapeFactory.getShape("Rectangle").draw();
    }
}
