package com;

/**
 * @author zhousheng
 * @date 2019/7/13
 *
 */
public class ShapeFactory {
    public static Shape getShape(String shapeType){
        if (shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }else if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }else{
            return null;
        }
    }
}
