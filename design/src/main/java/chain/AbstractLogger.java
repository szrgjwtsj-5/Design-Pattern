package chain;

/**
 * 责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。
 * 这种模式给予请求的类型，对请求的发送者和接收者进行解耦。这种类型的设计模式属于行为型模式。
 *
 * 在这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。
 *
 * <b>意图：</b>避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，
 * 直到有对象处理它为止。
 *
 * <b>主要解决：</b>职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递，
 * 所以职责链将请求的发送者和请求的处理者解耦了。<br/><br/>
 *
 * <b>使用场景：</b><br/>
 * 1、有多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定。 <br/>
 * 2、在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。 <br/>
 * 3、可动态指定一组对象处理请求。<br/>
 */
public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
