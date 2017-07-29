package controller;

import model.Field;
import model.Figure;
import model.Point;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Yaroslav on 29.07.2017.
 */
public class WinnerControllerTest {
    @Test
    public void getWinnerNull() throws Exception {
        final Field field = new Field();
        final WinnerController win = new WinnerController();

        assertNull(win.getWinner(field));
    }

    @Test
    public void getWinnerCheckRow() throws Exception {
        final Figure inputValue = Figure.X;
        final Figure expectValue = inputValue;

        final Field field = new Field();
        final WinnerController win = new WinnerController();

        for (int i = 0; i < field.getSize(); i++){
            field.setFigure(inputValue, new Point(1, i));
        }

        assertEquals(expectValue, win.getWinner(field));
    }

    @Test
    public void getWinnerCheckColumn() throws Exception {
        final Figure inputValue = Figure.X;
        final Figure expectValue = inputValue;

        final Field field = new Field();
        final WinnerController win = new WinnerController();

        for (int i = 0; i < field.getSize(); i++){
            field.setFigure(inputValue, new Point(i, 1));
        }

        assertEquals(expectValue, win.getWinner(field));
    }

    @Test
    public void getWinnerCheckDiag1() throws Exception {
        final Figure inputValue = Figure.X;
        final Figure expectValue = inputValue;

        final Field field = new Field();
        final WinnerController win = new WinnerController();

        for (int i = 0; i < field.getSize(); i++){
            field.setFigure(inputValue, new Point(i, i));
        }

        assertEquals(expectValue, win.getWinner(field));
    }

    public void getWinnerCheckDiag2() throws Exception {
        final Figure inputValue = Figure.X;
        final Figure expectValue = inputValue;

        final Field field = new Field();
        final WinnerController win = new WinnerController();

        field.setFigure(inputValue, new Point(0, 2));
        field.setFigure(inputValue, new Point(1, 1));
        field.setFigure(inputValue, new Point(2, 0));

        assertEquals(expectValue, win.getWinner(field));
    }

}