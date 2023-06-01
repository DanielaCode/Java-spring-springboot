package com.daniCode.AppGameRunner.calculatorTwoDataBases;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class RealWorldExampleWithData_Service_WebLayers {

    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(RealWorldExampleWithData_Service_WebLayers.class);
        var result = context.getBean(BussinessCalculatorService.class).findMax();
        System.out.println("resultado: "+result);
    }
}
