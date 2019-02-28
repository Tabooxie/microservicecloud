package com.taboo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class MicroservicecloudHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudHystrixApplication.class, args);
    }

}
