package observer;

public class BinaryObserver implements Observer {

    @Override
    public void update(String msg) {
        System.out.println("Binary: " + msg);
    }
}
