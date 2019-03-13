package game;

public class Player {
    private Colour colour;
    private Game game;

    public Player(Colour colour, Game game) {
        this.colour = colour;
        this.game = game;
    }

    public Colour getColour() {
        return colour;
    }

    public Game getGame() {
        return game;
    }
}
