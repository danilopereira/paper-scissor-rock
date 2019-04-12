package br.com.danilopereira.model;

public class Player {
    private Bet bet;
    private int countWins;

    public Player(Bet bet) {
        this.bet = bet;
        this.countWins = 0;
    }

    public Player() {

    }

    public void setBet(Bet bet) {
        this.bet = bet;
    }

    public Bet getBet() {
        return bet;
    }

    public int getCountWins() {
        return countWins;
    }

    public void addWins(){
        this.countWins++;
    }
}
