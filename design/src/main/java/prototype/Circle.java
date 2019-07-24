package prototype;

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("I am " + type + " and I draw " + type);
    }
}
