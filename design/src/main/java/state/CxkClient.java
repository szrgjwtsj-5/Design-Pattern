package state;

public class CxkClient {
    static final SingState singState = new SingState();
    static final JumpState jumpState = new JumpState();
    static final RapState rapState = new RapState();
    static final BasketballState basketballState = new BasketballState();

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        this.state.setCxk(this);
    }

    public void sing() {
        state.sing();
    }

    public void jump() {
        state.jump();
    }

    public void rap() {
        state.rap();
    }

    public void basketball() {
        state.basketball();
    }
}
