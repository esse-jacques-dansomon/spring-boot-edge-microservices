package com.clientui.microserviceclientui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.clientui.microserviceclientui")
@EnableDiscoveryClient
public class MicroserviceClientuiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceClientuiApplication.class, args);
    }

}
