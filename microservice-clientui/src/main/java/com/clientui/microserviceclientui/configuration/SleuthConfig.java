package com.clientui.microserviceclientui.configuration;

/**
 * Author  : essejacaues.co
 * Date    : 06/03/2023 00:53
 * Project : spring-boot-microservices $
 */
import brave.sampler.Sampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SleuthConfig

{
    public Sampler defaultSampler()

    {
        return Sampler.ALWAYS_SAMPLE;
    }
}