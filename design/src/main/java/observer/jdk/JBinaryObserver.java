package observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 基于JDK 实现的观察者模式，该类为观察者observer
 */
public class JBinaryObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof JSubject) {
            System.out.println("Binary String: " + Integer.toBinaryString(((JSubject) o).getState()));
        }
    }
}
