package com.cloudwatch;

import com.cloudwatch.services.CloudWatchLoggerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AppLauncher {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AppLauncher.class, args);

        CloudWatchLoggerService cloudWatchLoggerService = context.getBean(CloudWatchLoggerService.class);
        cloudWatchLoggerService.log("This is a log message.");
        SpringApplication.exit(context);

    }
}
