package com.wang.Factory;

public class GunFactory extends Factory{
    @Override
    public Weapon Generate() {
        return new Gun();
    }
}
