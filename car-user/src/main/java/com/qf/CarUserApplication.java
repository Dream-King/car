package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by 54110 on 2019/12/11.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CarUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarUserApplication.class);
    }

}
