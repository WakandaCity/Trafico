package org.example.wakandaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WakandaaApplication{
    public static void main(String[] args) {
        SpringApplication.run(WakandaaApplication.class, args);
    }}

