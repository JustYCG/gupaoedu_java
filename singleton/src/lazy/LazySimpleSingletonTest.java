package lazy;

import java.lang.reflect.Constructor;

/**
 * @Description TODO
 * @Author Chenguang.Yin
 * @Date 2019/6/17 20:21
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {
//        Thread t1 = new Thread(new MyThread());
//        Thread t2 = new Thread(new MyThread());
//
//        t1.start();
//        t2.start();

//        try {
//            Class<?> clazz = LazyInnerClassSingleton.class;
//            Constructor c = clazz.getDeclaredConstructor(null);
//            c.setAccessible(true);
//
//            Object ObjReflect = c.newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        LazyInnerClassSingleton.getInstance();
    }
}
