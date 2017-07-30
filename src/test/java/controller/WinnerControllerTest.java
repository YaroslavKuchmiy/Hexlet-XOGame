package controller;

import model.Field;
import model.Figure;
import model.Point;
import org.junit.Test;

import static org.junit.Assert.*;


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

        Field field = new Field();
        final WinnerController win = new WinnerController();

        for (int x = 0; x < field.getSize(); x++) {
            field = new Field();
            for (int i = 0; i < field.getSize(); i++) {
                field.setFigure(inputValue, new Point(x, i));
            }
            assertEquals(expectValue, win.getWinner(field));
        }
    }

    @Test
    public void getWinnerCheckRowNull() throws Exception {
        Field field = new Field();
        final WinnerController win = new WinnerController();

        for (int i = 0; i < field.getSize(); i++) {
            field = new Field();
            field.setFigure(Figure.X, new Point(i, 0));
            field.setFigure(Figure.O, new Point(i, 1));
            field.setFigure(Figure.X, new Point(i, 2));

            assertNull(win.getWinner(field));
        }
    }

    @Test
    public void getWinnerCheckColumn() throws Exception {
        final Figure inputValue = Figure.X;
        final Figure expectValue = inputValue;

        Field field = new Field();
        final WinnerController win = new WinnerController();

        for (int x = 0; x < field.getSize(); x++) {
            field = new Field();
            for (int i = 0; i < field.getSize(); i++) {
                field.setFigure(inputValue, new Point(i, x));
            }
            assertEquals(expectValue, win.getWinner(field));
        }
    }

    @Test
    public void getWinnerCheckColumnNull() throws Exception {
        Field field = new Field();
        final WinnerController win = new WinnerController();

        for (int i = 0; i < field.getSize(); i++) {
            field = new Field();
            field.setFigure(Figure.X, new Point(0, i));
            field.setFigure(Figure.O, new Point(1, i));
            field.setFigure(Figure.X, new Point(2, i));

            assertNull(win.getWinner(field));
        }
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

    @Test
    public void getWinnerCheckDiag1Null() throws Exception {
        Field field = new Field();
        final WinnerController win = new WinnerController();

        field.setFigure(Figure.X, new Point(0, 0));
        field.setFigure(Figure.O, new Point(1, 1));
        field.setFigure(Figure.X, new Point(1, 1));

        assertNull(win.getWinner(field));

    }

    @Test
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

    @Test
    public void getWinnerCheckDiag2Null() throws Exception {
        Field field = new Field();
        final WinnerController win = new WinnerController();

        field.setFigure(Figure.X, new Point(0, 2));
        field.setFigure(Figure.O, new Point(1, 1));
        field.setFigure(Figure.X, new Point(2, 0));

        assertNull(win.getWinner(field));

    }
}