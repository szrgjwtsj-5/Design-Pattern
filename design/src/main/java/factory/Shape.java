package factory;

public interface Shape {
    void draw();

    class Circle implements Shape{
        @Override
        public void draw() {
            System.out.println("draw circle");
        }
    }

    class Rectangle implements Shape {
        @Override
        public void draw() {
            System.out.println("draw rectangle");
        }
    }

    class Triangle implements Shape {
        @Override
        public void draw() {
            System.out.println("draw triangle");
        }
    }
}
