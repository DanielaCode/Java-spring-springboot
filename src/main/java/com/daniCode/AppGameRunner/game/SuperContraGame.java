package com.daniCode.AppGameRunner.game;

public class SuperContraGame implements GammingConsole{
    public void left() {
        System.out.println("go");
    }

    public void right() {
        System.out.println("go back");
    }

    public void down() {
        System.out.println("Sit Down");
    }

    public void up() {
        System.out.println("fly");
    }
}
