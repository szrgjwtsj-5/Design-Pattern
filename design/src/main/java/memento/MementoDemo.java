package memento;

/**
 * 备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。备忘录模式属于行为型模式。<br/><br/>
 *
 * <b>主要解决：</b>所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，
 * 这样可以在以后将对象恢复到原先保存的状态。<br/>
 *
 * <b>何时使用：</b>很多时候我们总是需要记录一个对象的内部状态，这样做的目的就是为了允许用户取消不确定或者错误的操作，
 * 能够恢复到他原先的状态，使得他有"后悔药"可吃。<br/>
 *
 * <b>如何解决：</b>通过一个备忘录类专门存储对象状态。<br/>
 *
 * <b>关键代码：</b>客户不与备忘录类耦合，与备忘录管理类耦合。<br/>
 */
public class MementoDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("state #1");
        originator.setState("state #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("state #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("state #4");

        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));

        System.out.println("First saved State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(1));

        System.out.println("Second saved State: " + originator.getState());
    }
}
