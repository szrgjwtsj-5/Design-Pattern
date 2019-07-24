package builder;

/**
 * 建造者模式是日常开发中比较常见的设计模式，它的主要作用就是将复杂事物创建的过程抽象出来，<br/>
 * 该抽象的不同实现方式不同，创建出的对象也不同。通俗的讲，创建一个对象一般都会有一个固定的步骤，<br/>
 * 这个固定的步骤我们把它抽象出来，每个抽象步骤都会有不同的实现方式，不同的实现方式创建出的对象也将不同。
 *
 */
public interface ComputerConfigBuilder {
    void setCPU();
    void setMemory();
    void setHardDisk();
    void setKeyboard();
    void setMouse();

    Computer getComputer();
}
