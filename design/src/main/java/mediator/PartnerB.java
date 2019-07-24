package mediator;

public class PartnerB extends CardPartner {

    public PartnerB(int money) {
        setMoney(money);
    }

    @Override
    public void changeMoney(int money, Mediator mediator) {
        mediator.bWin(money);
    }
}
