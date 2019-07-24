package factory;

/**
 * 工厂模式
 */
public interface ShapeFactory {

    Shape getShape();

    class CircleFactory implements ShapeFactory {
        @Override
        public Shape getShape() {
            return new Shape.Circle();
        }
    }

    class RectangleFactory implements ShapeFactory {
        @Override
        public Shape getShape() {
            return new Shape.Rectangle();
        }
    }

    class TriangleFactory implements ShapeFactory {
        @Override
        public Shape getShape() {
            return new Shape.Triangle();
        }
    }
}
