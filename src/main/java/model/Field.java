package model;


public class Field {

    private final int sizeField = 3;
    private final Figure[][] figures = new Figure[sizeField][sizeField];

    public int getSize() {
        return figures.length;
    }

    public Figure getFigure(final Point point) {
        return figures[point.getX()][point.getY()];
    }

    public void setFigure (final Figure figure, final Point point) {
        figures[point.getX()][point.getY()] = figure;
    }

}
