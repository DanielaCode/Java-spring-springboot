package com.daniCode.AppGameRunner.gameWithSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationGamingSpringConfig {

    @Bean
    public GammingConsole game(){
        return new PacmanGame();
    }
    @Bean
    public GameRunner gameRunner(GammingConsole game){
        return new GameRunner(game);
    }

}
