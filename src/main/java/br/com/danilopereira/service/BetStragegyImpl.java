package br.com.danilopereira.service;

import br.com.danilopereira.model.Bet;

public class BetStragegyImpl implements BetStragegy {
    public Bet defeat(Bet playerBet) {
        if(Bet.SCISSOR.equals(playerBet)){
            return Bet.PAPER;
        }
        if(Bet.ROCK.equals(playerBet)){
            return Bet.SCISSOR;
        }

        return Bet.ROCK;
    }
}
