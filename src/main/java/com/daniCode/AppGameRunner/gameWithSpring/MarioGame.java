package com.daniCode.AppGameRunner.gameWithSpring;

public class MarioGame implements GammingConsole {
    public void left() {
        System.out.println("Run");
    }

    public void right() {
        System.out.println("Reverse");
    }

    public void down() {
        System.out.println("Fall in a Hole");
    }

    public void up() {
        System.out.println("Jump");
    }
}
