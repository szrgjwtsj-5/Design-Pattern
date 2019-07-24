package mediator;

/**
 * 中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。这种模式提供了一个中介类，
 * 该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。中介者模式属于行为型模式。
 *
 * <b>意图：</b>用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，
 * 而且可以独立地改变它们之间的交互。<br/>
 *
 * <b>主要解决：</b>对象与对象之间存在大量的关联关系，这样势必会导致系统的结构变得很复杂，
 * 同时若一个对象发生改变，我们也需要跟踪与之相关联的对象，同时做出相应的处理。<br/>
 *
 * <b>何时使用：</b>多个类相互耦合，形成了网状结构。<br/>
 *
 * <b>如何解决：</b>将上述网状结构分离为星型结构。<br/>
 */
public abstract class Mediator {
    protected CardPartner partner1;
    protected CardPartner partner2;

    public Mediator(CardPartner partner1, CardPartner partner2) {
        this.partner1 = partner1;
        this.partner2 = partner2;
    }

    public abstract void aWin(int money);
    public abstract void bWin(int money);
}
