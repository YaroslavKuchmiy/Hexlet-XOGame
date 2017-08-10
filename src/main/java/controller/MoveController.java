package controller;


import model.Field;
import model.Figure;
import model.Point;
import model.exception.AlreadyOccupiedException;
import model.exception.InvalidPointException;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure)
                            throws AlreadyOccupiedException,
                            InvalidPointException {
        if (field.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }
        field.setFigure(figure, point);
    }

}
