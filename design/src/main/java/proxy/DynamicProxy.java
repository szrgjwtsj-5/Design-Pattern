package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理，适用于被代理的类实现了接口
 *
 * 生成代理类的一篇原理文章 https://blog.csdn.net/lovejj1994/article/details/78080124
 */
public class DynamicProxy implements InvocationHandler {

    private Image image;

    public DynamicProxy(Image image) {
        this.image = image;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println();

        if (method.getName().equals("display")) {
            System.out.println("调用 display 方法");
            return method.invoke(image, args);
        }
        return null;
    }
}
