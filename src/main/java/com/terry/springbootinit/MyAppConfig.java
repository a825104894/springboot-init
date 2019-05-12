package com.terry.springbootinit;

import com.terry.springbootinit.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

    @Bean
    public Person helloPerson(){
        return new Person();
    }
}
