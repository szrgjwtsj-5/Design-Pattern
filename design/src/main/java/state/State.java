package state;

/**
 * 在状态模式（State Pattern）中，类的行为是基于它的状态改变的。这种类型的设计模式属于行为型模式。
 *
 * 在状态模式中，我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。<br/><br/>
 *
 * <b>意图：</b>允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。<br/>
 *
 * <b>主要解决：</b>对象的行为依赖于它的状态（属性），并且可以根据它的状态改变而改变它的相关行为。<br/>
 *
 * <b>何时使用：</b>代码中包含大量与对象状态有关的条件语句。<br/>
 *
 * <b>如何解决：</b>将各种具体的状态类抽象出来。<br/>
 */
public abstract class State {

    protected CxkClient cxk;

    public void setCxk(CxkClient cxk) {
        this.cxk = cxk;
    }

    public abstract void sing();
    public abstract void jump();
    public abstract void rap();
    public abstract void basketball();
}
