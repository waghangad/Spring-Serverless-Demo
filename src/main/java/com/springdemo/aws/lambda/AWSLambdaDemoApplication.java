package com.springdemo.aws.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AWSLambdaDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AWSLambdaDemoApplication.class, args);
        System.out.print("This is Print Statement");
    }
}