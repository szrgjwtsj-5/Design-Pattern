package factory;

/**
 * 简单工厂模式
 */
public class SimpleShapeFactory {

    public Shape getShape(ShapeType type) {
        switch (type) {
            case CIRCLE:
                return new Shape.Circle();
            case RECTANGLE:
                return new Shape.Rectangle();
            case TRIANGLE:
                return new Shape.Triangle();
            default:
                return null;
        }
    }
}
