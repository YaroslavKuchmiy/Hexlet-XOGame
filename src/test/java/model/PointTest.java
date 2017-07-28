package model;

import static org.junit.Assert.*;

public class PointTest {
    @org.junit.Test
    public void getX() throws Exception {
        final int inputValue = 1;
        final int expectedValue = inputValue;

        Point point = new Point(inputValue, 0);
        assertEquals(expectedValue, point.getX());
    }

    @org.junit.Test
    public void getY() throws Exception {
        final int inputValue = 1;
        final int expectedValue = inputValue;

        Point point = new Point(0, inputValue);
        assertEquals(expectedValue, point.getY());

    }

}