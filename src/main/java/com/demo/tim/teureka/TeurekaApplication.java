package com.demo.tim.teureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TeurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeurekaApplication.class, args);
    }

}
