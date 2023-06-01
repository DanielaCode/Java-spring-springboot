package com.daniCode.AppGameRunner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//record is a new feature of java 16 that allows:
//-eliminate verbosity in java beans
//-public accessors, method constructor, hashcode an toString are automatically created


record Person(String name,int age){};
@Configuration
public class HelloWorldSpringFWConfig {
    @Bean
    public String name(){
        return "Dani";
    }
    @Bean
    public int age(){
        return 15;
    }
    @Bean
    public Person person(){
        return new Person("sofi",17);
    }
}
