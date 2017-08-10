package controller;


import model.Field;
import model.Figure;
import model.Point;
import model.exception.InvalidPointException;

public class WinnerController {

    final private int index0 = 0;
    final private int index1 = 1;
    final private int index2 = 2;
    private Figure winnerFigure;

    public Figure getWinner(final Field field) {
        try {
            if (checkROwAndColumn(field) != null
                    || checkDiag1(field) != null
                    || checkDiag2(field) != null) {
                return winnerFigure;
            }
        } catch (InvalidPointException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Figure checkROwAndColumn(final Field field)
                                    throws InvalidPointException {
        for (int i = 0; i < field.getSize(); i++) {
            if (field.getFigure(new Point(i, index0)) != null
                    && field.getFigure(new Point(i, index0))
                    == field.getFigure(new Point(i, index1))
                    && field.getFigure(new Point(i, index0))
                    == field.getFigure(new Point(i, index2))) {
                return winnerFigure = field.getFigure(new Point(i, index0));
            }
            if (field.getFigure(new Point(index0, i)) != null
                    && field.getFigure(new Point(index0, i))
                    == field.getFigure(new Point(index1, i))
                    && field.getFigure(new Point(index0, i))
                    == field.getFigure(new Point(index2, i))) {
                return winnerFigure = field.getFigure(new Point(index0, i));
            }
        }
        return null;
    }

    private Figure checkDiag1(final Field field)
                            throws InvalidPointException {
        if (field.getFigure(new Point(index0, index0)) != null
                && field.getFigure(new Point(index0, index0))
                == field.getFigure(new Point(index1, index1))
                && field.getFigure(new Point(index0, index0))
                == field.getFigure(new Point(index2, index2))) {
            return winnerFigure = field.getFigure(new Point(index0, index0));
        }
        return null;
    }

    private Figure checkDiag2(final Field field)
                            throws InvalidPointException {
        if (field.getFigure(new Point(index0, index2)) != null
                && field.getFigure(new Point(index0, index2))
                == field.getFigure(new Point(index1, index1))
                && field.getFigure(new Point(index1, index1))
                == field.getFigure(new Point(index2, index0))) {
            return winnerFigure = field.getFigure(new Point(index1, index1));
        }
        return null;
    }
}
