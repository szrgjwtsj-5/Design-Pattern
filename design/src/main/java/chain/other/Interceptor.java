package chain.other;

public interface Interceptor {

    String intercept(Chain chain);

    interface Chain {
        String request();

        String proceed(String request);
    }
}
