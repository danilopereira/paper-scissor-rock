package br.com.danilopereira.application;

import br.com.danilopereira.model.Bet;
import br.com.danilopereira.model.Player;
import br.com.danilopereira.service.BetService;
import br.com.danilopereira.utils.GenerateRandomBet;

public class Main {

    public static void main(String[] args){
        Player player1 = new Player(Bet.PAPER);
        Player player2 = new Player();
        BetService betService = new BetService();
        for(int i = 0; i < 100; i++){
            player2.setBet(GenerateRandomBet.generateRandom());
            betService.fight(player1, player2);
        }

        String player1Wins = String.format("Player 1 wins %d of 100 games", player1.getCountWins());
        String player2Wins = String.format("Player 2 wins %d of 100 games", player2.getCountWins());
        String tieCount = String.format("Tie: %d of 100 games", betService.getTieCount());
        System.out.println(player1Wins);
        System.out.println(player2Wins);
        System.out.println(tieCount);

    }


}
