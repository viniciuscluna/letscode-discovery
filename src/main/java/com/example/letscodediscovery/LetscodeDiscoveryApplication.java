package com.example.letscodediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LetscodeDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LetscodeDiscoveryApplication.class, args);
    }

}
