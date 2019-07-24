package abstractfactory;

public interface Mouse {
    void sayHi();

    class DellMouse implements Mouse {
        public void sayHi() {
            System.out.println("DellMouse");
        }
    }

    class HpMouse implements Mouse {
        public void sayHi() {
            System.out.println("HpMouse");
        }
    }
}
