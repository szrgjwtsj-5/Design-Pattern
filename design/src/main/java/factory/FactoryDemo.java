package factory;

public class FactoryDemo {

    public static void main(String[] args) {
        Shape shape = new SimpleShapeFactory().getShape(ShapeType.CIRCLE);
        shape.draw();

        Shape shape1 = new ShapeFactory.RectangleFactory().getShape();
        shape1.draw();
    }
}
