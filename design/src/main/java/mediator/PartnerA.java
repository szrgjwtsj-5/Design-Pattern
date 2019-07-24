package mediator;

public class PartnerA extends CardPartner {

    public PartnerA(int money) {
        setMoney(money);
    }

    @Override
    public void changeMoney(int money, Mediator mediator) {
        mediator.aWin(money);
    }
}
