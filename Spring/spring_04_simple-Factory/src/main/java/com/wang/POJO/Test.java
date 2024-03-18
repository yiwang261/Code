package com.wang.POJO;

public class Test {
    public static void main(String[] args) {
        Weapon tank = WeaponFactory.get("TANK");
        tank.attack();
    }
}
