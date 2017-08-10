package model;

import model.exception.InvalidPointException;
import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTest {
    @Test
    public void getSize() throws Exception {
        final int expectedValue = 3;

        final Field field = new Field();

        assertEquals(expectedValue,field.getSize());

    }

    @Test
    public void getFigure() throws Exception {
        final Figure inputValue = Figure.X;
        final Figure expectedValue = inputValue;

        final Field field = new Field();
        final Point point = new Point(1, 1);
        field.setFigure(inputValue,point);

        assertEquals(expectedValue,field.getFigure(point));
    }

    @Test
    public void getFigureCheckPointMaxX() throws Exception {
        final Field field = new Field();
        final Point point = new Point(3, 0);

        try {
            field.getFigure(point);
            fail();
        } catch (InvalidPointException e){}
    }

    @Test
    public void getFigureCheckPointMinX() throws Exception {
        final Field field = new Field();
        final Point point = new Point(-1, 0);

        try {
            field.getFigure(point);
            fail();
        } catch (InvalidPointException e){}
    }

    @Test
    public void getFigureCheckPointMaxY() throws Exception {
        final Field field = new Field();
        final Point point = new Point(0, 3);

        try {
            field.getFigure(point);
            fail();
        } catch (InvalidPointException e){}
    }

    @Test
    public void getFigureCheckPointMinY() throws Exception {
        final Field field = new Field();
        final Point point = new Point(0, -1);

        try {
            field.getFigure(point);
            fail();
        } catch (InvalidPointException e){}
    }

    @Test
    public void setFigureCheckPointMaxX() throws Exception {
        final Figure figure = Figure.X;
        final Field field = new Field();
        final Point point = new Point(3, 0);

        try {
            field.setFigure(figure, point);
            fail();
        } catch (InvalidPointException e){}
    }

    @Test
    public void setFigureCheckPointMinX() throws Exception {
        final Figure figure = Figure.X;
        final Field field = new Field();
        final Point point = new Point(-1, 0);

        try {
            field.setFigure(figure, point);
            fail();
        } catch (InvalidPointException e){}
    }

    @Test
    public void setFigureCheckPointMaxY() throws Exception {
        final Figure figure = Figure.X;
        final Field field = new Field();
        final Point point = new Point(0, 3);

        try {
            field.setFigure(figure, point);
            fail();
        } catch (InvalidPointException e){}
    }

    @Test
    public void setFigureCheckPointMinY() throws Exception {
        final Figure figure = Figure.X;
        final Field field = new Field();
        final Point point = new Point(0, -1);

        try {
            field.setFigure(figure, point);
            fail();
        } catch (InvalidPointException e){}
    }

}