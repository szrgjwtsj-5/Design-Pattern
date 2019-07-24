package abstractfactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        HpFactory hpFactory = new HpFactory();
        Mouse hpMouse = hpFactory.createMouse();
        hpMouse.sayHi();
        KeyBoard hpKeyBoard = hpFactory.createKeyBoard();
        hpKeyBoard.sayHi();
    }
}
