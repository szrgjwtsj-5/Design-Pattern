package state;

public class BasketballState extends State {

    @Override
    public void sing() {
        cxk.setState(CxkClient.singState);
        cxk.getState().sing();
    }

    @Override
    public void jump() {
        //
    }

    @Override
    public void rap() {
        //
    }

    @Override
    public void basketball() {
        System.out.println("cxk is playing basketball");
    }
}
