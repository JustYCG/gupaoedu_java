package SimpleFactoryPattern;

/**
 * 简单工厂方法不属于GOF,23 种设计模式（参考资料：
 * http://en.wikipedia.org/wiki/Design_Patterns#Patterns_by_Type）
 */
public class SimpleFactoryTest {
    public static void main(String[] args){
        WeaponsFactory weaponsFactory = new WeaponsFactory();
        weaponsFactory.createWeapon("SimpleFactoryPattern.AutomaticRifle").shoot();
        weaponsFactory.createWeapon("SimpleFactoryPattern.SniperRifle").shoot();

        //class反射实例化
        weaponsFactory.createWeapon(AutomaticRifle.class).shoot();
        weaponsFactory.createWeapon(SniperRifle.class).shoot();
    }
}
