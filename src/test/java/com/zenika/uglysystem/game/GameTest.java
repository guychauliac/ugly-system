package com.zenika.uglysystem.game;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    private static Game createGame() {
        Game game = new Game();
        game.add("p1");
        game.add("p2");
        return game;
    }

    @Test
    public void canAddPlayers() {
        Game game = GameTest.createGame();
        assertEquals(2, game.howManyPlayers());
        assertTrue(game.isPlayable());
    }
    
    @Test
    public void gameIsNotPlayable() {
        Game game = new Game();
        game.add("p1");
        assertEquals(1, game.howManyPlayers());
        assertFalse(game.isPlayable());
    }
    
    @Test
    public void canAnswerQuestions() {
        Game game = GameTest.createGame();
        game.roll(0);
        assertTrue(game.wrongAnswer());
        game.roll(1);
        assertTrue(game.wasCorrectlyAnswered());
        game.roll(1);
        for (int i = 0; i < 10; ++i) {
            game.wasCorrectlyAnswered();    
        }
    }
}
