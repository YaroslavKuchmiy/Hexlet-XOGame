package model;


public class Game {

    private final String name;
    private final String player1;
    private final String player2;
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

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public Field getField() {
        return field;
    }

    public class GameBuilder {

        public String name;
        public String player1;
        public String player2;
        public Field field;

        public GameBuilder name(String name){
            this.name = name;
            return this;
        }
        public GameBuilder player1(String player1){
            this.player1 = player1;
            return this;
        }
        public GameBuilder player2(String player2){
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
        public String getPlayer1(){
            return this.player1;
        }
        public String getPlayer2(){
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
