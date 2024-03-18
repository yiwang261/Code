package com.wang.Factory;

public class Test {
    public static void main(String[] args) {
//        DaggerFactory daggerFactory = new DaggerFactory();
//        Weapon dagger= daggerFactory.Generate();
//        dagger.attack();
//
//        GunFactory gunFactory = new GunFactory();
//        Weapon Gun = gunFactory.Generate();
//        Gun.attack();

        System.out.println(ClientService.createInstance());
        System.out.println(ClientService.createInstance());
    }
}
