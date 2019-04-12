package br.com.danilopereira.service;

import br.com.danilopereira.model.Bet;
import br.com.danilopereira.model.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class BetServiceTest {

    BetService betService;

    @Before
    public void setup(){
        betService = new BetService();
    }

    @Test
    public void testNoWinners(){
        Player player1 = new Player(Bet.PAPER);
        Player player2 = new Player(Bet.PAPER);

        Player winner = betService.fight(player1, player2);

        assertNull(winner);
    }


    @Test
    public void testPaperBeatsRock(){
        Player player1 = new Player(Bet.PAPER);
        Player player2 = new Player(Bet.ROCK);

        Player winner = betService.fight(player1, player2);

        assertEquals(winner, player1);
    }

    @Test
    public void testRockBeatsScissor(){
        Player player1 = new Player(Bet.ROCK);
        Player player2 = new Player(Bet.SCISSOR);

        Player winner = betService.fight(player1, player2);

        assertEquals(winner, player1);
    }


    @Test
    public void testScissorBeatsPaper(){
        Player player1 = new Player(Bet.SCISSOR);
        Player player2 = new Player(Bet.PAPER);

        Player winner = betService.fight(player1, player2);

        assertEquals(winner, player1);
    }
}
