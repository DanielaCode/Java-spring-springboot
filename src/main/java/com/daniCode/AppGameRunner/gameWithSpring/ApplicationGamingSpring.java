package com.daniCode.AppGameRunner.gameWithSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationGamingSpring {
    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(ApplicationGamingSpringConfig.class);
        context.getBean(GameRunner.class).run();
    }
}
