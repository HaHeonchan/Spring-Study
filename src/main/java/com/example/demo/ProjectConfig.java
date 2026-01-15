package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.example.demo")
public class ProjectConfig {
    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("papago");
        return p;
    }
    @Bean
    public Parrot zarrot() {
        Parrot p = new Parrot();
        p.setName("zapago");
        return p;
    }

//    @Bean
//    public Person person(@Qualifier("zarrot") Parrot parrot) {
//        Person p = new Person(parrot);
//        p.setName("Ranigo");
//        return p;
//    }
}
