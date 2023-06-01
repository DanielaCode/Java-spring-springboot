package com.daniCode.AppGameRunner.gameWithSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacmanGameQualifier")
public class PacmanGame implements GammingConsole {
    public void left() {
        System.out.println("Eat");
    }

    public void right() {
        System.out.println("Eat");
    }

    public void down() {
        System.out.println("Eat");
    }

    public void up() {
        System.out.println("Eat");
    }
}
