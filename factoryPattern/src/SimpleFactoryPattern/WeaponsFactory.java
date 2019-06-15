package SimpleFactoryPattern;

/**
 * 优化的简单工厂，根据具体的类型返回产品。
 */
public class WeaponsFactory {
    public Weapon createWeapon(String weaponType){
        if("SimpleFactoryPattern.AutomaticRifle".equals(weaponType)){
            return new AutomaticRifle();
        }else if("SimpleFactoryPattern.SniperRifle".equals(weaponType)){
            return new SniperRifle();
        }else{
            return null;
        }
    }

    /**
     *
     * @param weaponType
     * @return
     */
    public Weapon createWeapon(Class<? extends Weapon> weaponType){
       if(weaponType!=null){
           try {
               return weaponType.newInstance();
           } catch (InstantiationException e) {
               e.printStackTrace();
           } catch (IllegalAccessException e) {
               e.printStackTrace();
           }
       }
       return null;
    }
}
