package model;


public class Game {

    private final String name;
    private final String player1;
    private final String player2;
    private final Field field;

    public Game(final String name, final String player1, final String player2, final Field field) {
        this.name = name;
        this.player1 = player1;
        this.player2 = player2;
        this.field = field;
    }

    public String getName() {
        return name;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public Field getField() {
        return field;
    }
}
