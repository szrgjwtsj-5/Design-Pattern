package observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class JHexObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof JSubject) {
            System.out.println("Hex String: " + Integer.toHexString(((JSubject) o).getState()));
        }
    }
}
