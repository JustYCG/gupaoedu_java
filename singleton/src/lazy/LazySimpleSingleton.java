package lazy;

/**
 * @Description TODO
 * @Author Chenguang.Yin
 * @Date 2019/6/17 20:18
 *
 * 单例模式2： 懒汉模式
 * 特点：
 * 缺点：
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton(){    }


    //tips1: 多线程调试，debug可以开启thread模式
    //tips2: synchronized在jdk1.6后虽然优化过但是还是会造成类被锁
    //tips3: 双重锁解决synchronized锁问题
    public synchronized static LazySimpleSingleton getInstance(){
        //线程不安全
        if(lazySimpleSingleton == null){
            //实例化的时候及return时会出现问题
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
