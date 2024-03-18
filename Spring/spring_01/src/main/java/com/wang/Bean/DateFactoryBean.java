package com.wang.Bean;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFactoryBean implements FactoryBean<Date> {
    private String strDate;
    public DateFactoryBean(String strDate){
        this.strDate=strDate;
    }
    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(strDate);
        return date;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
