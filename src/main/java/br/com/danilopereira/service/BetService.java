package br.com.danilopereira.service;

import br.com.danilopereira.model.Bet;
import br.com.danilopereira.model.Player;

public class BetService {
    private int tieCount;


    public BetService(){
        this.tieCount = 0;
    }

    public void fight(Player player1, Player player2) {
        Bet player1Bet = player1.getBet();
        Bet player2Bet = player2.getBet();
        System.out.println("Player1: " + player1.getBet().name());
        System.out.println("Player2: " + player2.getBet().name());
        if(player1Bet.equals(player2Bet)){
            this.tieCount++;
        }else if(Bet.PAPER.equals(player1Bet)){
            if(Bet.ROCK.equals(player2Bet)){
                player1.addWins();
            }else{
                player2.addWins();
            }
        }else if(Bet.SCISSOR.equals(player1Bet)){
            if (Bet.PAPER.equals(player2Bet)){
                player1.addWins();
            }else{
                player1.addWins();
            }
        }else if(Bet.ROCK.equals(player1Bet)){
            if(Bet.SCISSOR.equals(player2Bet)){
                player1.addWins();
            }else{
                player2.addWins();
            }
        }
    }



    public int getTieCount() {
        return tieCount;
    }
}
