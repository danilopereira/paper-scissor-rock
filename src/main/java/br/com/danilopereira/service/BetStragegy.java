package br.com.danilopereira.service;

import br.com.danilopereira.model.Bet;

public interface BetStragegy {
    Bet defeat(Bet playerBet);
}
