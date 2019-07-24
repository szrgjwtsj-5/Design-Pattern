package abstractfactory;

public interface KeyBoard {
    void sayHi();

    class DellKeyBoard implements KeyBoard {
        public void sayHi() {
            System.out.println("DellKeyBoard");
        }
    }

    class HpKeyBoard implements KeyBoard {
        public void sayHi() {
            System.out.println("HpKeyBoard");
        }
    }
}
