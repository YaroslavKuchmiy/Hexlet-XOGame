package model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Yaroslav on 28.07.2017.
 */
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

}