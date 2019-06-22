package register;

/**
 * @Description TODO
 * @Author Chenguang.Yin
 * @Date 2019/6/22 12:53
 *  jdk层面防止被反射
 */

public enum EnumSingleton {
    INSTANCE;

    public Object getData() {
        return data;
    }

    private Object data;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
