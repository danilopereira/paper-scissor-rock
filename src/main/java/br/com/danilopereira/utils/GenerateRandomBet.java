package br.com.danilopereira.utils;

import br.com.danilopereira.model.Bet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GenerateRandomBet {
    public static Bet generateRandom(){
        List<Bet> bets = Collections.unmodifiableList(Arrays.asList(Bet.values()));
        Random random = new Random();
        return bets.get(random.nextInt(bets.size()));
    }
}
