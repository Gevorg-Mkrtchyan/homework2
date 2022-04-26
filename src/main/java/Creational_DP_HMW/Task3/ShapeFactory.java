package Creational_DP_HMW.Task3;

/**
 * Task 3
 * Create a ShapeFactory for construction of different shapes ( rectangle, circle, triangle…)
 */
public class ShapeFactory {
    public Shape getShape(ShapeType shapeType) {
        Shape shape = null;
        switch (shapeType) {
            case RECTANGLE -> shape = new Rectangle();
            case CIRCLE -> shape = new Circle();
            case TRIANGLE -> shape = new Triangle();
            default -> throw new IllegalArgumentException("Wrong shape type:" + shapeType);
        }
        return shape;
    }
}
