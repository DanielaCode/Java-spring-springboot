package com.daniCode.AppGameRunner;

import com.daniCode.AppGameRunner.game.*;

public class AppGamingBasicJava {

    public static void main(String[] args){
        //GammingConsole game = new MarioGame();
        //GammingConsole game = new SuperContraGame();
        GammingConsole game = new PacmanGame();//object creation

        GameRunner gr = new GameRunner(game);//object creation + wiring dependencies we are injecting an object to game runner
        gr.run();
    }

}
