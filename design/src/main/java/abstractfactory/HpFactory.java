package abstractfactory;

public class HpFactory extends PcFactory {

    @Override
    public Mouse createMouse() {
        return new Mouse.HpMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new KeyBoard.HpKeyBoard();
    }
}
