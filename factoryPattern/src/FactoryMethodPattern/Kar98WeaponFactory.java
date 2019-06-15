package FactoryMethodPattern;

import SimpleFactoryPattern.Weapon;
import SimpleFactoryPattern.SniperRifle;

public class Kar98WeaponFactory implements GreateWeaponFactory {
    @Override
    public Weapon create() {
        return new SniperRifle();
    }
}
