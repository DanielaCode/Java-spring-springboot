package com.daniCode.AppGameRunner.game;

public class GameRunner {
    SuperContraGame game;
    public GameRunner(SuperContraGame game) {
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
