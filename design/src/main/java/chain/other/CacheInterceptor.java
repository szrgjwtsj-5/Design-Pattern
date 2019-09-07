package chain.other;

public class CacheInterceptor implements Interceptor {

    @Override
    public String intercept(Chain chain) {
        System.out.println("before proceed, cache...");

        String res = chain.proceed(chain.request());

        System.out.println("after proceed, cache...");

        return res;
    }
}
