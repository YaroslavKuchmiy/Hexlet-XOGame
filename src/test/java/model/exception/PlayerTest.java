package model.exception;

import model.Figure;
import org.junit.Test;

import static org.junit.Assert.*;


public class PlayerTest {
    @Test
    public void getName() throws Exception {
        final String inputValue = "Max";
        final String expectedValue = inputValue;

        final Player player = new Player(inputValue, null);

        assertEquals(expectedValue, player.getName());
    }

    @Test
    public void getFigure() throws Exception {
        final Figure inputValue = Figure.X;
        final Figure expectedValue = inputValue;

        final Player player = new Player(null, inputValue);

        assertEquals(expectedValue, player.getFigure());
    }

}