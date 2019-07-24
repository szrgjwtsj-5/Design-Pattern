package memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento state) {
        mementos.add(state);
    }

    public Memento get(int idx) {
        return mementos.get(idx);
    }
}
