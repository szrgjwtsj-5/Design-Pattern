package template;

/**
 * 在模板模式（Template Pattern）中，一个抽象类公开定义了执行它的方法的方式/模板。
 * 它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。这种类型的设计模式属于行为型模式。<br/><br/>
 *
 * <b>意图：</b>定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。<br/>
 *
 * <b>使用场景：</b><br/>
 * 1、有多个子类共有的方法，且逻辑相同。<br/>
 * 2、重要的、复杂的方法，可以考虑作为模板方法。<br/>
 *
 * <b>注意事项：</b>为防止恶意操作，一般模板方法都加上 final 关键词。<br/>
 */
public abstract class Game {
    public abstract void init();
    public abstract void startPlay();
    public abstract void endPlay();

    public final void play() {
        init();
        startPlay();
        endPlay();
    }
}
