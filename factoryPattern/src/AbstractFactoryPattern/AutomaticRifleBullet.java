package AbstractFactoryPattern;

/**
 * 自动步枪弹药
 */
public class AutomaticRifleBullet implements Bullet {
    @Override
    public void reload() {
        System.out.println("5.56mm reload!");
    }
}
