package controller;


import model.Field;
import model.Figure;
import model.Point;
import model.exception.InvalidPointException;

public class CurrentMoveController {

    private int countX = 0;
    private int countO = 0;

    public Figure currentMove(final Field field) {
        try {
            accountFiguresOnTheField(field);
        } catch (InvalidPointException e) {
            e.printStackTrace();
        }

        if (countO + countX == field.getSize() * field.getSize()) {
            return null;
        }
        if (countX == countO) {
            return Figure.X;
        }
        return Figure.O;
    }

    private void accountFiguresOnTheField(final Field field)
                                            throws InvalidPointException {
        for (int x = 0; x < field.getSize(); x++) {
            for (int y = 0; y < field.getSize(); y++) {
                if (field.getFigure(new Point(x, y)) == Figure.X) {
                    countX++;
                }
                if (field.getFigure(new Point(x, y)) == Figure.O) {
                    countO++;
                }
            }
        }
    }

}
