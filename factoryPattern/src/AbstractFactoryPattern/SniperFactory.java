package AbstractFactoryPattern;

public class SniperFactory implements AbstractWeaponFactory{
    @Override
    public Bullet createBullet() {
        return new SniperBullet();
    }

    @Override
    public Weapon createWeapon() {
        return new SniperWeapon();
    }
}
