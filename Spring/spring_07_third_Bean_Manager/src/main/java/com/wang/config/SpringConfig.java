package com.wang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.awt.*;

@Configuration
@Import(jdbcConfig.class)
public class SpringConfig {

    @Bean
    public List aaa(){
        return new List();
    }
}
