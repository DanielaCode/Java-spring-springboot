package com.daniCode.AppGameRunner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldSpringFWConfig {
    @Bean
    public String name(){
        return "Dani";
    }
}
