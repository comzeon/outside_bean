package com.ssm.spring_mybatis.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.ssm.spring_mybatis")
@PropertySource({"Jdbc.properties"})
@Import({JdbcConfig.class})
public class SpringConfig {
}
