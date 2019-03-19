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
        assertEquals(game.howManyPlayers(), 2);
        assertTrue(game.isPlayable());
    }
    
    @Test
    public void canAnswerQuestions() {
        Game game = GameTest.createGame();
        game.roll(0);
        assertTrue(game.wrongAnswer());
        game.roll(1);
        assertTrue(game.wasCorrectlyAnswered());
    }
}
