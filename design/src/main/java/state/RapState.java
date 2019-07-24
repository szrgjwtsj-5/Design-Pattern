package state;

public class RapState extends State {

    @Override
    public void sing() {
        //
    }

    @Override
    public void jump() {
        //
    }

    @Override
    public void rap() {
        System.out.println("cxk is rapping");
    }

    @Override
    public void basketball() {
        cxk.setState(CxkClient.basketballState);
        cxk.getState().basketball();
    }
}
