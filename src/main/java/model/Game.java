package model;


import model.exception.Player;

public class Game {

    private final String name;
    private final Player player1;
    private final Player player2;
    private final Field field;

    public Game(final GameBuilder gameBuilder) {
        this.name = gameBuilder.getName();
        this.player1 = gameBuilder.getPlayer1();
        this.player2 = gameBuilder.getPlayer2();
        this.field = gameBuilder.getField();
    }

    public String getName() {
        return name;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Field getField() {
        return field;
    }

    public class GameBuilder {

        public String name;
        public Player player1;
        public Player player2;
        public Field field;

        public GameBuilder name(String name){
            this.name = name;
            return this;
        }
        public GameBuilder player1(Player player1){
            this.player1 = player1;
            return this;
        }
        public GameBuilder player2(Player player2){
            this.player2 = player2;
            return this;
        }
        public GameBuilder field(Field field){
            this.field = field;
            return this;
        }

        public String getName(){
            return this.name;
        }
        public Player getPlayer1(){
            return this.player1;
        }
        public Player getPlayer2(){
            return this.player2;
        }
        public Field getField(){
            return this.field;
        }

        public Game build(){
            return new Game(this);
        }

    }

}
