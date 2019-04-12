package br.com.danilopereira.service;

import br.com.danilopereira.model.Bet;
import br.com.danilopereira.model.Player;

public class BetService {
    private BetStragegy betStragegy;


    public BetService(){
        this.betStragegy = new BetStragegyImpl();
    }

    public Player fight(Player player1, Player player2) {
        if(player1.getBet().equals(player2.getBet())){
            return null;
        }

        Bet betDefeated = betStragegy.defeat(player1.getBet());
        if(betDefeated.equals(player2.getBet())){
            return player1;
        }
        return player2;
    }

}
