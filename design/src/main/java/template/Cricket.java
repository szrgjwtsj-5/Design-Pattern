package template;

public class Cricket extends Game {
    @Override
    public void init() {
        System.out.println("Cricket game init");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket game start");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket game end");
    }
}
