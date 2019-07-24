package abstractfactory;

public class DellFactory extends PcFactory {

    @Override
    public Mouse createMouse() {
        return new Mouse.DellMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new KeyBoard.DellKeyBoard();
    }
}
