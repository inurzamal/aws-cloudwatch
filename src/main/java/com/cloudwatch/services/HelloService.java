package com.cloudwatch.services;
import org.springframework.stereotype.Service;


@Service
public class HelloService {

    private final CloudWatchLoggerService cloudWatchLoggerService;

    public HelloService(CloudWatchLoggerService cloudWatchLoggerService) {
        this.cloudWatchLoggerService = cloudWatchLoggerService;
    }

    public String sayHello() {
        String message = "Hello, World!";
        cloudWatchLoggerService.log("SayHello method called: " + message);
        return message;
    }
}


