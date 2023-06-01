package com.daniCode.AppGameRunner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWordSpringFW {
    public  static void main(String[] args){
        /*
        * 1. create the Spring context on JVM java virtual machine and launch it
        * 2. configure the things that we want to spring manage - HelloWorldSpringFWConfig @Configuration - name @Bean
        * */

        //1.
        var context = new AnnotationConfigApplicationContext(HelloWorldSpringFWConfig.class);
        //throw this context I can access and use Beans for example name:
        var beanName = context.getBean("name");
        System.out.println(beanName);
    }
}
