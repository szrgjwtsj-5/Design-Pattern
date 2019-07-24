package state;

public class JumpState extends State {

    @Override
    public void sing() {
        //
    }

    @Override
    public void jump() {
        System.out.println("cxk is jumping with beidaiku");
    }

    @Override
    public void rap() {
        cxk.setState(CxkClient.rapState);
        cxk.getState().rap();
    }

    @Override
    public void basketball() {
        //
    }
}
