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
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean("person3"));
        System.out.println(context.getBean("person4"));

        // can retrieve beans with multiple option for example by class type
        //System.out.println(context.getBean(Person.class));

    }
}
