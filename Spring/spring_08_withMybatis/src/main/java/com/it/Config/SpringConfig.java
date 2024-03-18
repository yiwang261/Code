package com.it.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.it")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {

}
