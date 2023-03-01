package com.clientui.microserviceclientui.configuration;

import com.clientui.microserviceclientui.exceptions.CustomErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by essejacques.co
 * Date:  23/02/2023 22:30
 * Projet: spring-micro-services-ecom-openclassroom
 */
@Configuration
public class FeignExceptionConfig {

    @Bean
    public CustomErrorDecoder myCustomErrorDecoder() {
        return new CustomErrorDecoder();
    }

}
