package com.geekbrains.training.homework2NY;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.geekbrains.training.homework.spring"})

public class SpringConf {
    @Bean(value = "singleton")
    public SessionFactory sessionFactory() {

        SessionFactory sessionFactory;
        sessionFactory = new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        return sessionFactory;
    }
}