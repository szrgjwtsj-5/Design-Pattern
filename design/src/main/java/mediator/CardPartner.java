package mediator;

public abstract class CardPartner {
    private int money;

    public abstract void changeMoney(int money, Mediator mediator);

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
