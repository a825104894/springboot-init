package com.terry.springbootinit.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//加入IOC
@Component
public class Person {
    @Autowired
    private Friends friends;
    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                '}';
    }

    public Friends getFriends() {
        return friends;
    }

    public void setFriends(Friends friends) {
        this.friends = friends;
    }
}
