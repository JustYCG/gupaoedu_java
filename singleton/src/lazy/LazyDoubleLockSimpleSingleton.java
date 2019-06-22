package lazy;

/**
 * @Description TODO
 * @Author Chenguang.Yin
 * @Date 2019/6/17 20:18
 *
 * 单例模式2： 懒汉模式-双重锁
 * 特点：
 * 缺点：
 */
public class LazyDoubleLockSimpleSingleton {

    private static volatile LazyDoubleLockSimpleSingleton lazySimpleSingleton = null;

    private LazyDoubleLockSimpleSingleton(){    }

    //tips3: 双重检查锁解决synchronized锁问题
    public  static LazyDoubleLockSimpleSingleton getInstance(){
        if(lazySimpleSingleton == null){
            synchronized (LazyDoubleLockSimpleSingleton.class){
                if(lazySimpleSingleton == null){
                    lazySimpleSingleton = new LazyDoubleLockSimpleSingleton();
                    //cpu转为JVM指令执行
                    //2、3指令重排序问题，volatile加到对象声明上即可

                    //1 分配内存给对象
                    //2 初始化对象
                    //3 将初始化好的对象和内存地址关联，复制
                    //4 用户初次访问
                }
            }
        }
        return lazySimpleSingleton;
    }
}
