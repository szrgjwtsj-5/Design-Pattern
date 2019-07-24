package observer;

import observer.jdk.JBinaryObserver;
import observer.jdk.JHexObserver;
import observer.jdk.JOctalObserver;
import observer.jdk.JSubject;

public class ObserverDemo {
    public static void main(String[] args) {
        jdkObserver();
    }

    private static void jdkObserver() {
        JSubject jSubject = new JSubject();

        JBinaryObserver binaryObserver = new JBinaryObserver();
        JHexObserver hexObserver = new JHexObserver();
        JOctalObserver octalObserver = new JOctalObserver();

        jSubject.addObserver(binaryObserver);
        jSubject.addObserver(hexObserver);
        jSubject.addObserver(octalObserver);

        System.out.println("first state is 15");
        jSubject.setState(15);

        System.out.println("second state is 20");
        jSubject.setState(20);
    }

    private static void customObserver() {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver();
        HexalObserver hexalObserver = new HexalObserver();
        OctalObserver octalObserver = new OctalObserver();

        subject.registerObserver(binaryObserver);
        subject.registerObserver(hexalObserver);
        subject.registerObserver(octalObserver);

        System.out.println("first state is hhh");
        subject.setState("hhh");

        System.out.println("second state is 666");
        subject.setState("666");
    }
}
