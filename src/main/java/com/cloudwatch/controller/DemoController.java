package com.cloudwatch.controller;

import com.cloudwatch.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public ResponseEntity<String> test() {
        String msg = helloService.sayHello();
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
