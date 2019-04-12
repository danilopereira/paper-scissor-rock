package br.com.danilopereira.model;

public class Player {
    private Bet bet;

    public Player(Bet bet) {
        this.bet = bet;
    }

    public Player() {

    }

    public void setBet(Bet bet) {
        this.bet = bet;
    }

    public Bet getBet() {
        return bet;
    }
}
