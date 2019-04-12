package br.com.danilopereira.application;

import br.com.danilopereira.model.Bet;
import br.com.danilopereira.model.Player;
import br.com.danilopereira.service.BetService;
import br.com.danilopereira.utils.GenerateRandomBet;

public class Main {

    public static void main(String[] args){

        int player1Victories = 0;
        int player2Victories = 0;
        int ties = 0;
        int limit = 100;

        Player player1 = new Player(Bet.PAPER);
        Player player2 = new Player();
        BetService betService = new BetService();
        for(int i = 0; i < limit; i++){
            player2.setBet(GenerateRandomBet.generateRandom());
            Player winner = betService.fight(player1, player2);

            if(winner == null){
                ties++;
            }else if(winner.equals(player1)){
                player1Victories++;
            }else{
                player2Victories++;
            }
        }

        String player1Wins = String.format("Player 1 wins %d of 100 games", player1Victories);
        String player2Wins = String.format("Player 2 wins %d of 100 games", player2Victories);
        String tieCount = String.format("Tie: %d of 100 games", ties);
        System.out.println(player1Wins);
        System.out.println(player2Wins);
        System.out.println(tieCount);

    }


}
