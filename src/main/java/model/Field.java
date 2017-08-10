package model;


import model.exception.InvalidPointException;

public class Field {

    private static final int MIN_COORDINATE = 0;
    private final int sizeField = 3;
    private final Figure[][] figures = new Figure[sizeField][sizeField];

    public int getSize() {
        return figures.length;
    }

    public Figure getFigure(final Point point)
                            throws InvalidPointException {
        checkPoint(point);
        return figures[point.getX()][point.getY()];
    }

    public void setFigure(final Figure figure, final Point point)
                            throws InvalidPointException {
        checkPoint(point);
        figures[point.getX()][point.getY()] = figure;
    }

    private void checkPoint(final Point point)
                            throws InvalidPointException {
        if (point.getX() < MIN_COORDINATE || point.getY() < MIN_COORDINATE
                || point.getX() >= sizeField || point.getY() >= sizeField) {
            throw new InvalidPointException();
        }
    }
}
