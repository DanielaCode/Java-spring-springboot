package com.daniCode.AppGameRunner.helloWorldSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//record is a new feature of java 16 that allows:
//-eliminate verbosity in java beans
//-public accessors, method constructor, hashcode an toString are automatically created


record Person(String name,int age,Address adress){};
record Address(String street,int number){};

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
        return new Person("sofi",17, new Address("some",1));
    }
    @Bean(name = "person2") //for default the bean name is the method name, but we can use this argument to customize it
    @Primary
    public Person persona(){
        return new Person("sofi",17, new Address("some2",2));
    }
    @Bean(name = "person3")//can use beans to create new ones by two approaches
    public Person personCallMethod(){
        return new Person(name(),age(),address());
    }
    @Bean(name = "person4")
    public Person personParameterMethod(String name, int age,@Qualifier("officialAddress") Address address){
        return new Person(name,age,address);
    }

    @Bean(name = "address2")
    @Qualifier("officialAddress")
    public Address address(){
        return new Address("constituents",70);
    }

    @Bean(name = "address3")
    @Primary
    public Address addresss(){
        return new Address("constituents",54);
    }
}
