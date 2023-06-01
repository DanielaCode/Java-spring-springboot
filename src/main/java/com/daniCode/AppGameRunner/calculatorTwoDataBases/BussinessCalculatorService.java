package com.daniCode.AppGameRunner.calculatorTwoDataBases;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BussinessCalculatorService {
    private DataService ds;

    public BussinessCalculatorService(DataService ds) {
        this.ds = ds;
    }

    public int findMax(){
        return Arrays.stream(ds.retrieveData()).max().orElse(0);
    }
}
