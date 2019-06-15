package AbstractFactoryPattern;

/**
 * 抽象工厂模式（Abastract Factory Pattern）是指提供一个创建一系列相关或相互依赖对象的接口
 * 无须指定他们具体的类
 * 咕泡出品，必属精品 www.gupaoedu.com
 *
 * 抽象工厂是用户的主入口
 * 易于拓展
 * create by tom
 */
public interface AbstractWeaponFactory {
    Bullet createBullet();
    Weapon createWeapon();
}
