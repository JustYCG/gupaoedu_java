package threadlocal;

/**
 * @Description TODO
 * @Author Chenguang.Yin
 * @Date 2019/6/22 14:24
 *
 * 注册时（容器）
 * 伪线程安全，线程内安全，跨线程不安全
 *
 * 使用场景spring-orm 多数据源切换
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton(){}

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue(){
                    return new ThreadLocalSingleton();
                }
    };

    public static ThreadLocalSingleton getInstance(){
      return threadLocalInstance.get();
    }
}
