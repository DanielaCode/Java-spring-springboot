package com.daniCode.AppGameRunner.gameWithSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GammingConsole game;
    public GameRunner(@Qualifier("PacmanGameQualifier") GammingConsole game) {
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
