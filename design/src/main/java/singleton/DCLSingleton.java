package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 双重检查锁机制单例模式
 */
public class DCLSingleton implements Serializable {

    private static final long serialVersionUID = 1L;

    private static volatile DCLSingleton instance;

    private AtomicInteger counter = new AtomicInteger(0);
    private int c;
    private static boolean flag = false;

    private DCLSingleton() {
        // 此种单例模式可能通过反射来破解，通过添加这个标志位来阻止
        if (flag) {
            throw new RuntimeException("我TM是单例，别想通过反射搞幺蛾子");
        }
        flag = true;
    }

    public static DCLSingleton getInstance() {
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                if (instance == null) {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }

    public int addNum() {
//        return counter.addAndGet(1);

        return ++c;
    }

    // 支持序列化的单例，可能在序列化和反序列化之后导致单例被破坏，定义该方法可防止反序列化重新创建对象
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
