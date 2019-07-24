package template;

public class Football extends Game {
    @Override
    public void init() {
        System.out.println("Football game init");
    }

    @Override
    public void startPlay() {
        System.out.println("Football game start");
    }

    @Override
    public void endPlay() {
        System.out.println("Football game end");
    }
}
