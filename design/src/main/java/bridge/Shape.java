package bridge;

/**
 * 桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。这种类型的设计模式属于结构型模式，
 * 它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
 *
 * 这种模式涉及到一个作为桥接的接口，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。<br/>
 * <br/>
 * <b>使用场景: </b><br/>
 * 1、如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，
 * 通过桥接模式可以使它们在抽象层建立一个关联关系。 <br/>
 * 2、对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。<br/>
 * 3、一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。<br/>
 *
 * <br/>
 * <a href=https://www.runoob.com/w3cnote/bridge-pattern2.html>参考文档</a>
 *
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
