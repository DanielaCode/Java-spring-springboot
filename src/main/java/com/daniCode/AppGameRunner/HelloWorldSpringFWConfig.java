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
    @Bean(name = "person2") //for default the bean name is the method name, but we can use this argument to customize it
    public Person persona(){
        return new Person("sofi",17);
    }
    @Bean(name = "person3")//can use beans to create new ones by two approaches
    public Person personCallMethod(){
        return new Person(name(),age());
    }
    @Bean(name = "person4")
    public Person personParameterMethod(String name, int age){
        return new Person(name,age);
    }
}
