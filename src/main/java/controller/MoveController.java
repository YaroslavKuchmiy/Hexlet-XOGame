package controller;


import model.Field;
import model.Figure;
import model.Point;
import model.exception.AlreadyOccupiedException;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) throws AlreadyOccupiedException {
        if (field.getFigure(point) != null){
            throw new AlreadyOccupiedException();
        }
        field.setFigure(figure, point);
    }

}
