package command;

/**
 * 命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。请求以命令的形式包裹在对象中，并传给调用对象。
 * 调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
 *
 * <b>意图：</b> 将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化。
 *
 * <b>主要解决：</b> 在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、
 * 撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
 */
public class CommandDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}
