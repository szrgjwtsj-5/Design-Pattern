package chain.other;

public class FinalInterceptor implements Interceptor {
    @Override
    public String intercept(Chain chain) {
        System.out.println("i am final interceptor");

        return chain.request() + " ----- result";
    }
}
