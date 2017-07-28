package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void getName() throws Exception {
        final String inputValue = "XO";
        final String expectedValue = inputValue;

        final Player player = new Player("Max", Figure.O);
        final Field field = new Field();
        final Game game = new Game.GameBuilder()
                                    .name(inputValue)
                                    .player1(player)
                                    .player2(player)
                                    .field(field)
                                    .build();

        assertEquals(expectedValue,game.getName());
    }

    @Test
    public void getPlayer1() throws Exception {
        final Player inputValue = new Player("Max", Figure.O);
        final Player expectedValue = inputValue;

        final Player player2 = new Player("Jek", Figure.O);
        final Field field = new Field();
        final Game game = new Game.GameBuilder()
                                    .name("")
                                    .player1(inputValue)
                                    .player2(player2)
                                    .field(field)
                                    .build();

        assertEquals(expectedValue,game.getPlayer1());
    }

    @Test
    public void getPlayer2() throws Exception {
        final Player inputValue = new Player("Max", Figure.O);
        final Player expectedValue = inputValue;

        final Player player1 = new Player("Jek", Figure.O);
        final Field field = new Field();
        final Game game = new Game.GameBuilder()
                                    .name("")
                                    .player1(player1)
                                    .player2(inputValue)
                                    .field(field)
                                    .build();

        assertEquals(expectedValue,game.getPlayer2());
    }

    @Test
    public void getField() throws Exception {
        final Field inputValue = new Field();
        final Field expectedValue = inputValue;

        final Player player = new Player("Max", Figure.O);
        final Field field = new Field();
        final Game game = new Game.GameBuilder()
                                    .name("")
                                    .player1(player)
                                    .player2(player)
                                    .field(inputValue)
                                    .build();

        assertEquals(expectedValue,game.getField());
    }

}