package chain.other;

public class RequestInterceptor implements Interceptor {
    @Override
    public String intercept(Chain chain) {
        String request = chain.request() + "---my intercept";

        return chain.proceed(request);
    }
}
