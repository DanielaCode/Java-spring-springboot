package com.daniCode.AppGameRunner.gameWithSpring;

public class GameRunner {
    GammingConsole game;
    public GameRunner(GammingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Game Running: "+game);
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
