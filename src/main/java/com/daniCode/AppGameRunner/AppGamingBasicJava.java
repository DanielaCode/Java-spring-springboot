package com.daniCode.AppGameRunner;

import com.daniCode.AppGameRunner.game.GameRunner;
import com.daniCode.AppGameRunner.game.MarioGame;
import com.daniCode.AppGameRunner.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args){
        MarioGame marioGame = new MarioGame();
        SuperContraGame superContraGame = new SuperContraGame();

        GameRunner gr = new GameRunner(superContraGame);
        gr.run();
    }

}
