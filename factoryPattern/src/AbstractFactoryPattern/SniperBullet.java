package AbstractFactoryPattern;

public class SniperBullet implements Bullet {
    @Override
    public void reload() {
        System.out.println("ting ting ting ting ting 7.62mm reload !");
    }
}
