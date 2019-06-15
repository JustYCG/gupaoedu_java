package AbstractFactoryPattern;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractWeaponFactory automatic = new AutomaticRifleFactory();
        AbstractWeaponFactory sniper = new SniperFactory();

        automatic.createBullet().reload();
        automatic.createWeapon().shoot();

        sniper.createWeapon().shoot();
        sniper.createBullet().reload();
    }
}
