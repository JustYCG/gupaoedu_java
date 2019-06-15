package FactoryMethodPattern;

import SimpleFactoryPattern.AutomaticRifle;
import SimpleFactoryPattern.Weapon;

public class M4A1WeaponFactory implements GreateWeaponFactory {
    @Override
    public Weapon create() {
        return new AutomaticRifle();
    }
}
