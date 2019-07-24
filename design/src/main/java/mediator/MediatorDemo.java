package mediator;

public class MediatorDemo {

    public static void main(String[] args) {
        CardPartner a = new PartnerA(20);
        CardPartner b = new PartnerB(20);

        Mediator mediator = new MoneyMediator(a, b);

        a.changeMoney(5, mediator);
        System.out.println("A win! A's money is " + a.getMoney() + " and B's money is " + b.getMoney());
        System.out.println();

        b.changeMoney(6, mediator);
        System.out.println("B win! A's money is " + a.getMoney() + " and B's money is " + b.getMoney());
        System.out.println();
    }
}
