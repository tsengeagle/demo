package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by tsengeagle on 2017/05/18.
 */
@Configuration
@PropertySource("application.properties")
public class DemoConfiguration {

    @Autowired
    Environment environment;

    @Bean
    public Member CreateMemberBean() {
        return new Member(
                environment.getProperty("Prop1","default prop1"),
                environment.getProperty("Prop2","prop2 default value")
        );
    }

}
