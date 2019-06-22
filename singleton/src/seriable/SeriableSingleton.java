package seriable;

/**
 * @Description TODO
 * @Author Chenguang.Yin
 * @Date 2019/6/22 13:18
 *
 * 序列化单例->写文件->再读出来 序列化破坏单例
 * 分析：
 * readObject->readObject0->checkResolve
 *  是否能被初始化，构造为null？初始化：""；
 *
 *  * jdk 提供readResolve方法解决单例被序列化破坏的问题
 *  * readResolve 重写，覆盖反序列化的对象
 *  * 创建了两次，再jvm层面，相对安全
 *  *
 *  * 反序列化的对象会被GC回收
 *
 */
public class SeriableSingleton {

}
