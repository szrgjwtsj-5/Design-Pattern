package singleton;

/**
 * 使用枚举类实现的单例，是最佳方法，自动支持序列化，防止多次实例化
 */
public enum EnumSingleton {
    INSTANCE();

    private int num;

    public int addNum() {
        return ++num;
    }
}
