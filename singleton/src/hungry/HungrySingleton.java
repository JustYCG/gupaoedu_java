package hungry;

/**
 * @Description TODO
 * @Author Chenguang.Yin
 * @Date 2019/6/17 20:09
 *
 * 单例模式1：饿汉模式
 * 特点：首次加载时就创建实例
 * 缺点：耗费内存空间（线程安全，仅限于小规模使用）
 */
public class HungrySingleton {

    //tips1: static 代码块会在类加载时立即初始化
    //tips2: final 修饰无法被反射、其他类修改
    //方式1
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    //方式2
//    private static final HungrySingleton hungrySingleton;
//    static {
//        hungrySingleton = new HungrySingleton();
//    }
    private HungrySingleton(){  }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
