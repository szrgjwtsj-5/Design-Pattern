package proxy;

import java.lang.reflect.Proxy;

/**
 * 代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。<br/><br/>
 *
 * <b>使用场景：</b><br/>
 * 按职责来划分，通常有以下使用场景：<br/>
 * 1、远程代理。
 * 2、虚拟代理。 <br/>
 * 3、Copy-on-Write 代理。
 * 4、保护（Protect or Access）代理。
 * 5、Cache代理。 <br/>
 * 6、防火墙（Firewall）代理。
 * 7、同步化（Synchronization）代理。 <br/>
 * 8、智能引用（Smart Reference）代理。<br/><br/>
 *
 * <b>注意事项：</b><br/>
 * 1、和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。 <br/>
 * 2、和装饰器模式的区别：装饰器模式为了增强功能，而代理模式是为了加以控制。<br/>
 */
public class ProxyDemo {

    public static void main(String[] args) {
//        dynamicProxy();
        cglibProxy();
    }

    private static void proxy() {
        Image image = new ProxyImage("test.jpg");
        image.display();

        image.display();
    }

    private static void dynamicProxy() {
        Image image = new RealImage("hhh.mp4");

        DynamicProxy dynamicProxy = new DynamicProxy(image);

        Image proxyImage = (Image) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{Image.class}, dynamicProxy);

        proxyImage.display();

        proxyImage.display();
    }

    private static void cglibProxy() {
        Engineer engineer = new Engineer();

        Engineer proxyEngineer = (Engineer) CglibProxy.getProxy(engineer);

        proxyEngineer.eat();

        // final 方法无法代理
        proxyEngineer.work();
    }
}
