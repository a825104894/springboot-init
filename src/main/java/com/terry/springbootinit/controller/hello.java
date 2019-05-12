package com.terry.springbootinit.controller;

import com.terry.springbootinit.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @Autowired
    Person helloPerson;

    @RequestMapping("/hello")
    public String getHello(){
        System.out.println(helloPerson.toString());
        return "hello";
    }
}
