package observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class JOctalObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof JSubject) {
            System.out.println("Octal String: " + Integer.toOctalString(((JSubject) o).getState()));
        }
    }
}
