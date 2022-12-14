package org.mingwu.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class TestController {

    @GetMapping(value = "/hello")
    public void helloWorld(){
        System.err.println("hello ~");
    }
}
