package state;

public class SingState extends State {

    @Override
    public void sing() {
        System.out.println("cxk is singing --- 《chicken, you are so beautiful》");
    }

    @Override
    public void jump() {
        cxk.setState(CxkClient.jumpState);
        cxk.getState().jump();
    }

    @Override
    public void rap() {
        //
    }

    @Override
    public void basketball() {
        //
    }
}
