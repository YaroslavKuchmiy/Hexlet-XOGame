package controller;

import model.Field;
import model.Figure;
import model.Point;
import org.junit.Test;

import static org.junit.Assert.*;


public class CurrentMoveControllerTest {
    @Test
    public void currentMoveNull() throws Exception {
        final Field field = new Field();
        final CurrentMoveController checkMove = new CurrentMoveController();

        for (int x = 0; x < field.getSize(); x++) {
            for (int y = 0; y < field.getSize(); y++) {
                field.setFigure(Figure.X, new Point(x, y));
            }
        }

        assertNull(checkMove.currentMove(field));
    }

    @Test
    public void currentMoveFigureX() throws Exception {
        final Figure expectValue = Figure.X;

        final Field field = new Field();
        final CurrentMoveController checkMove = new CurrentMoveController();

        field.setFigure(Figure.X, new Point(0, 1));
        field.setFigure(Figure.O, new Point(1, 0));
        field.setFigure(Figure.X, new Point(1, 1));
        field.setFigure(Figure.O, new Point(2, 1));

        assertEquals(expectValue, checkMove.currentMove(field));
    }

    @Test
    public void currentMoveFigureO() throws Exception {
        final Figure expectValue = Figure.O;

        final Field field = new Field();
        final CurrentMoveController checkMove = new CurrentMoveController();

        field.setFigure(Figure.X, new Point(0, 1));
        field.setFigure(Figure.O, new Point(1, 0));
        field.setFigure(Figure.X, new Point(1, 1));

        assertEquals(expectValue, checkMove.currentMove(field));
    }

}