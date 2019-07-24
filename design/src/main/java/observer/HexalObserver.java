package observer;

public class HexalObserver implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("Hexal: " + msg);
    }
}
