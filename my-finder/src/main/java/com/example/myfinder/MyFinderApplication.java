package com.example.myfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableCircuitBreaker
@EnableEurekaClient
@EnableHystrixDashboard
@SpringBootApplication
public class MyFinderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFinderApplication.class, args);
    }

}
