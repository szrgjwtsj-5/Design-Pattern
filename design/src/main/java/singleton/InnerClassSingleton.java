package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 静态内部类实现单例，利用的是类的加载机制保证初始化 instance 时只有一个线程，Singleton 类
 * 被装载时，instance不会初始化，因为SingletonHolder 没有被主动使用，只有调用getInstance 方法时
 * 才会显式装载SingletonHolder 这时才会初始化instance，从而实现延迟加载。
 */
public class InnerClassSingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private static class SingletonHolder {
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }

    private int counter;
    private static boolean flag = false;

    private InnerClassSingleton(){
        if (flag) {
            throw new RuntimeException("我TM是单例，别想通过反射搞幺蛾子");
        }
        flag = true;
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }

    public int addNum() {
        return ++counter;
    }

    private Object readResolve() throws ObjectStreamException {
        return SingletonHolder.instance;
    }
}
