package FactoryMethodPattern;

public class FactoryMethodTest {
    public static void main(String[] args){
        GreateWeaponFactory weaponFactory1 = new Kar98WeaponFactory();
        GreateWeaponFactory weaponFactory2 = new M4A1WeaponFactory();

        weaponFactory1.create().shoot();
        weaponFactory2.create().shoot();
    }
}
