package facade;

import factory.Shape;

/**
 * 外观模式（Facade Pattern）隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。
 * 这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，来隐藏系统的复杂性。
 *
 * 这种模式涉及到一个单一的类，该类提供了客户端请求的简化方法和对现有系统类方法的委托调用。
 *
 * 意图：为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。<br/><br/>
 *
 * <b>使用场景：</b><br/>
 *  1、为复杂的模块或子系统提供外界访问的模块 <br/>
 *  2、子系统相对独立 <br/>
 *  3、预防低水平人员带来的风险 <br/>
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape triangle;

    public ShapeMaker() {
        circle = new Shape.Circle();
        rectangle = new Shape.Rectangle();
        triangle = new Shape.Triangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawTriangle() {
        triangle.draw();
    }
}
