package com.wang.POJO;

public class WeaponFactory {

    public static Weapon get(String weaponType){
        if (weaponType.equals("DAGGER"))
            return new Dagger();
        else if (weaponType.equals("TANK"))
            return new Tank();
        else if (weaponType.equals("HEILICOPTER"))
            return new Helicopter();
        else {
            throw new RuntimeException("不支持改武器的生产");
        }
    }
}
