package br.com.danilopereira.application;

import br.com.danilopereira.model.Bet;
import br.com.danilopereira.model.Player;
import br.com.danilopereira.service.BetService;
import br.com.danilopereira.utils.GenerateRandomBet;

public class Main {

    private static final String PLAYER_1_IDENTIFIER = "1";
    private static final String PLAYER_2_IDENTIFIER = "2";

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

        printMessages(player1Victories, player2Victories, ties);
    }

    private static void printMessages(int player1Victories, int player2Victories, int ties) {
        String playerCountVictoriesMessage = "Player %s wins %d of 100 games";
        String winnerMessage = "Winner is: Player %s (%d to %d wins)";

        System.out.println(String.format(playerCountVictoriesMessage, PLAYER_1_IDENTIFIER, player1Victories));
        System.out.println(String.format(playerCountVictoriesMessage, PLAYER_2_IDENTIFIER, player2Victories));
        System.out.println(String.format("Ties: %d of 100 games", ties));

        if(player1Victories > player2Victories){
            System.out.println(String.format(winnerMessage, PLAYER_1_IDENTIFIER, player1Victories, player2Victories));
        }else{
            System.out.println(String.format(winnerMessage, PLAYER_2_IDENTIFIER, player2Victories, player1Victories));
        }
    }


}
