package mediator;

public class MoneyMediator extends Mediator {

    public MoneyMediator(CardPartner partner1, CardPartner partner2) {
        super(partner1, partner2);
    }

    @Override
    public void aWin(int money) {
        partner1.setMoney(partner1.getMoney() + money);
        partner2.setMoney(partner2.getMoney() - money);
    }

    @Override
    public void bWin(int money) {
        partner2.setMoney(partner2.getMoney() + money);
        partner1.setMoney(partner1.getMoney() - money);
    }
}
