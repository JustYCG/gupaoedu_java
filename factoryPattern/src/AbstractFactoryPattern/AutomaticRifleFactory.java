package AbstractFactoryPattern;

public class AutomaticRifleFactory implements AbstractWeaponFactory {
    @Override
    public Bullet createBullet() {
        return new AutomaticRifleBullet();
    }

    @Override
    public Weapon createWeapon() {
        return new AutomaticRifleWeapon();
    }
}
