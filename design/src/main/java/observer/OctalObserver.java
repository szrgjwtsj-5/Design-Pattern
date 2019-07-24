package observer;

public class OctalObserver implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("Octal: " + msg);
    }
}
