package lazy;

import java.awt.*;

/**
 * @Description TODO 多线程测试类
 * @Author Chenguang.Yin
 * @Date 2019/6/17 20:24
 *
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        LazyDoubleLockSimpleSingleton lazyDoubleLockSimpleSingleton = LazyDoubleLockSimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+">>>"+lazyDoubleLockSimpleSingleton);

        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+">>>"+lazySimpleSingleton);
    }
}
