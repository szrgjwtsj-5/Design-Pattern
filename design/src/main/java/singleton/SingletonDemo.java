package singleton;

import java.io.*;
import java.lang.reflect.Constructor;

// 本例中还写了两种破解单例的方法，但都无法破解使用枚举实现的，这也就是为什么说枚举实现的单例是最佳实践原因之一
public class SingletonDemo {

    public static void main(String[] args) {
//        reflect(DCLSingleton.class);

//        serial();
    }

    private static <C> void reflect(Class<C> clazz) {       // 通过反射来破解单例，使用枚举实现的无法破解

        try {
            Constructor<C> c = clazz.getDeclaredConstructor();
            c.setAccessible(true);

            C s1 = c.newInstance();
            C s2 = c.newInstance();


            System.out.println(s1);
            System.out.println(s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void serial() {          // 通过序列化和反序列化来破解单例，使用枚举实现的无法破解
        try {
            InnerClassSingleton s1 = InnerClassSingleton.getInstance();

            String dirPath = System.getProperty("java.io.tmpdir") + "/serialTest";
            File dir = new File(dirPath);
            if (!dir.exists()) {
                dir.mkdir();
            }

            String filePath = dirPath + "s_tmp";
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile();
            }

            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);

            oos.close();
            fos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
            InnerClassSingleton s2 = (InnerClassSingleton) ois.readObject();

            System.out.println(s1);
            System.out.println(s2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void test() {
        Thread t1 = new Thread(() -> {
//            DCLSingleton singleton = DCLSingleton.getInstance();
//            InnerClassSingleton singleton = InnerClassSingleton.getInstance();
            EnumSingleton singleton = EnumSingleton.INSTANCE;
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread#1: " + singleton.addNum());
            }
            System.out.println("Thread#1: " + singleton);
        });

        Thread t2 = new Thread(() -> {
//            DCLSingleton singleton = DCLSingleton.getInstance();
//            InnerClassSingleton singleton = InnerClassSingleton.getInstance();
            EnumSingleton singleton = EnumSingleton.INSTANCE;
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread#2: " + singleton.addNum());
            }
            System.out.println("Thread#2: " + singleton);
        });

        t1.start();
        t2.start();
    }
}
