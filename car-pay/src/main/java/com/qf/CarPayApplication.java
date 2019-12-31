package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by 54110 on 2019/12/11.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class CarPayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarPayApplication.class);
    }
}
