package com.sean.consul.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulProducerApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulProducerApplication2.class, args);
    }
}