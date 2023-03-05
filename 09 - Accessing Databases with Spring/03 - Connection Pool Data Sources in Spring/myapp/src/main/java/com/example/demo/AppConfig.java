package com.example.demo;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.example.demo")
public class AppConfig {

    @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:mydb");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        dataSource.setMaxActive(5);
        dataSource.setMaxIdle(30000);

        return dataSource;
    }

}
