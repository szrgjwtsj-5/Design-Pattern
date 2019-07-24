package flyweight;

import factory.Shape;

import java.util.HashMap;

/**
 * 享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。
 * 这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。<br/><br/>
 *
 * <b>何时使用：</b><br/>
 * 1、系统中有大量对象。 <br/>
 * 2、这些对象消耗大量内存。 <br/>
 * 3、这些对象的状态大部分可以外部化。 <br/>
 * 4、这些对象可以按照内蕴状态分为很多组，当把外蕴对象从对象中剔除出来时，每一组对象都可以用一个对象来代替。 <br/>
 * 5、系统不依赖于这些对象身份，这些对象是不可分辨的。<br/><br/>
 *
 * <b>注意事项：</b><br/>
 * 1、注意划分外部状态和内部状态，否则可能会引起线程安全问题。 <br/>
 * 2、这些类必须有一个工厂对象加以控制。
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>(5);

    public static Circle getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
