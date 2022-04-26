package Creational_DP_HMW;

import Creational_DP_HMW.Task2.Book;
import Creational_DP_HMW.Task2.BookBuilder;
import Creational_DP_HMW.Task3.Shape;
import Creational_DP_HMW.Task3.ShapeFactory;
import Creational_DP_HMW.Task3.ShapeType;
import Creational_DP_HMW.Task3.Triangle;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        Shape triangle = shapeFactory.getShape(ShapeType.TRIANGLE);
        System.out.println(rectangle);
        System.out.println(circle);
        System.out.println(triangle);
    }
}
