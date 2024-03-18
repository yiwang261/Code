package com.wang.Factory;

public class DaggerFactory extends Factory{
    @Override
    public Weapon Generate() {
        return new Dagger();
    }
}
