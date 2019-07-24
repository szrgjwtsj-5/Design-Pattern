package state;

public class StateDemo {
    public static void main(String[] args) {
        CxkClient cxk = new CxkClient();

        cxk.setState(new SingState());

        cxk.sing();
        cxk.jump();
        cxk.rap();
        cxk.basketball();
    }
}
