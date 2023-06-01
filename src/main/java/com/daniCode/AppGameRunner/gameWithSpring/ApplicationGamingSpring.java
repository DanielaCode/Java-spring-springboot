package com.daniCode.AppGameRunner.gameWithSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.daniCode.AppGameRunner.gameWithSpring")
public class ApplicationGamingSpring {
    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(ApplicationGamingSpring.class);
        context.getBean(GameRunner.class).run();
    }
}
