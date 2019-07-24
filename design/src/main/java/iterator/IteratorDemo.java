package iterator;

/**
 * 迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式。这种模式用于顺序访问集合对象的元素，
 * 不需要知道集合对象的底层表示。迭代器模式属于行为型模式。
 *
 * <b>主要解决：</b>不同的方式来遍历整个整合对象。<br/>
 *
 * <b>何时使用：</b>遍历一个聚合对象。<br/>
 *
 * <b>如何解决：</b>把在元素之间游走的责任交给迭代器，而不是聚合对象。<br/>
 */
public class IteratorDemo {

    public static void main(String[] args) {
        LinkedContainer<String> ss = new LinkedContainer<>();

        ss.add("what");
        ss.add("the");
        ss.add("fuck");

        for (Iterator it = ss.getIterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }

        ss.add("hhh");

//        System.out.println(ss.get(3));
//        System.out.println(ss.length());
        for (Iterator it = ss.getIterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }

        ss.remove("what");

//        System.out.println(ss.get(3));
//        System.out.println(ss.length());

        for (Iterator it = ss.getIterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
    }
}
