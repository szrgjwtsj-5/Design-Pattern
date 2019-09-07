package chain.other;

import java.util.ArrayList;
import java.util.List;

public class InterceptorDemo {

    public static void main(String[] args) {
        List<Interceptor> interceptors = new ArrayList<>();
        interceptors.add(new RequestInterceptor());
        interceptors.add(new CacheInterceptor());
        interceptors.add(new FinalInterceptor());

        String request = "request";
        RealInterceptorChain chain = new RealInterceptorChain(interceptors, request, 0);

        System.out.println("result = " + chain.proceed(request));
    }

    /**
     * 责任链模式，在OkHttp 中使用的
     */
    static class RealInterceptorChain implements Interceptor.Chain {

        List<Interceptor> interceptors;
        int index;
        String request;

        RealInterceptorChain(List<Interceptor> interceptors, String request, int index) {
            this.interceptors = interceptors;
            this.request = request;
            this.index = index;
        }

        @Override
        public String request() {
            return request;
        }

        @Override
        public String proceed(String request) {
            if (index < 0 || index > interceptors.size()) return null;

            // 获取下一个责任链
            RealInterceptorChain next = new RealInterceptorChain(interceptors, request, index + 1);

            // 执行当前拦截器
            Interceptor interceptor = interceptors.get(index);

            return interceptor.intercept(next);
        }
    }
}
