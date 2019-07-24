package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 该模式定义了对象之间的一对多依赖关系，Subject 对象是一，Observer 对象是多。当 Subject 对象的状态发生改变时，
 * 所有依赖于该 Subject 对象的 Observer 对象都会得到通知，并且自动更新。观察者模式属于行为型模式。<br/><br/>
 *
 * <b>主要解决：</b>一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作。<br/>
 *
 * <b>何时使用：</b>一个对象（目标对象）的状态发生改变，所有的依赖对象（观察者对象）都将得到通知，进行广播通知。<br/>
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    public void registerObserver(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }

    public void notifyAllObservers() {
        for (Observer o : observers) {
            o.update(state);
        }
    }
}
