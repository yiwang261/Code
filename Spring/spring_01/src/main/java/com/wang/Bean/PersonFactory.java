package com.wang.Bean;

import org.springframework.beans.factory.FactoryBean;

public class PersonFactory implements FactoryBean<Person> {
//    通过工厂Bean可以获取普通Bean
    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
