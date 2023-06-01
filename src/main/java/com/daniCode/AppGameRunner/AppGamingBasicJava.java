package com.daniCode.AppGameRunner;

import com.daniCode.AppGameRunner.game.GameRunner;
import com.daniCode.AppGameRunner.game.MarioGame;

public class AppGamingBasicJava {

    public static void main(String[] args){
        MarioGame marioGame = new MarioGame();
        GameRunner gr = new GameRunner(marioGame);
        gr.run();
    }

}
