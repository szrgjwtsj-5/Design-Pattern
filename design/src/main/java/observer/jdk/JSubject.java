package observer.jdk;

import java.util.Observable;

/**
 * 基于JDK 实现的观察者模式，该类为被观察者subject
 */
public class JSubject extends Observable {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.setChanged();
        this.notifyObservers();
    }
}
