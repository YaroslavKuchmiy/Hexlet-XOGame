package controller;

import model.Field;
import model.Figure;
import model.Point;
import model.exception.AlreadyOccupiedException;
import org.junit.Test;

import static org.junit.Assert.*;


public class MoveControllerTest {
    @Test
    public void applyFigure() throws Exception {
        final Figure inputValue = Figure.X;
        final Figure expectValue = inputValue;

        final Point point = new Point(1, 1);
        final Field field = new Field();
        final MoveController move = new MoveController();

        move.applyFigure(field, point, inputValue);

        assertEquals(expectValue,field.getFigure(point));
    }

    @Test
    public void applyFigureCheckOccupied() throws Exception {
        final Figure figure = Figure.X;
        final Point point = new Point(1, 1);
        final Field field = new Field();
        final MoveController move = new MoveController();

        try {
            move.applyFigure(field, point, figure);
        } catch (AlreadyOccupiedException e){}

        try {
            move.applyFigure(field, point, figure);
            fail();
        } catch (AlreadyOccupiedException e){}
    }

}