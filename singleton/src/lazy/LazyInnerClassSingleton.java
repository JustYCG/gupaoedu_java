package lazy;

import java.lang.reflect.Constructor;

/**
 * @Description TODO
 * @Author Chenguang.Yin
 * @Date 2019/6/22 13:19
 *
 * 静态内部类方式单例,没有synchronized 关键字，所以性能好
 * 作业：内部类执行逻辑
 *
 * 缺点：可能被反射攻击，破坏单例
 *
 * tips：内部类生命周期和外部类一样
 */
public class LazyInnerClassSingleton {




//    {//反射方式破坏单例
//        try {
//            Class<?> clazz = LazyInnerClassSingleton.class;
//            Constructor c = clazz.getDeclaredConstructor(null);
//            c.setAccessible(true);
//
//            Object ObjReflect = c.newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    private LazyInnerClassSingleton(){
        //解决反射破坏单例
        if(lazyHolder.LAZY!=null){
            //防止反射调用
            throw new RuntimeException("禁止反射调用单例！");
        }

    }

    public static final LazyInnerClassSingleton getInstance(){
        return lazyHolder.LAZY;
    }

    private static class lazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

}
