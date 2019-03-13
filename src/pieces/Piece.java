package pieces;

import game.PieceType;
import game.Player;
import game.Tile;

public abstract class Piece {
    private int x, y;
    private Player player;
    private PieceType pieceType;
    /**
     * Constructor for piece
     * @param x position x of piece
     * @param y position y of piece
     * @param player player that piece belongs to
     */
    public Piece(int x, int y, Player player, PieceType type) {
        this.x = x;
        this.y = y;
        this.player = player;
        this.pieceType=type;
        this.player.getGame().getBoard().getTile(x, y).setPiece(this);
    }

    /**
     * A function that determines if the path is valid based on Piece type
     * @param finalX the final X location
     * @param finalY the final Y location
     * @return boolean indicating if the path is valid
     */
    public abstract boolean isValidPath(int finalX, int finalY);

    /**
     * A function that draws a path from one point to another based on Piece type and sets the piece at correct Tile
     * @param startX the initial x location
     * @param startY the initial y location
     * @param finalX the final x location
     * @param finalY the final y location
     * @return x and y changes
     */
    public abstract int[][] drawPath(int startX, int startY, int finalX, int finalY);

    /**
     * A function that returns the type of piece
     * @return an PieceType enum indicating the piece type (as defined in Enum)
     */
    public PieceType getType(){
        return this.pieceType;
    };

    /**
     * Getter for x
     * @return gets value of x
     */
    public int getX() {
        return x;
    }

    /**
     * Setter for x
     * @return sets value of x
     */
    public void setX(int x) {
        this.x = x;
    }
    /**
     * Getter for y
     * @return gets value of y
     */
    public int getY() {
        return y;
    }
    /**
     * Setter for y
     * @return sets value of y
     */
    public void setY(int y) {
        this.y = y;
    }
    /**
     * Getter for player
     * @return gets player that piece belongs to
     */
    public Player getPlayer() {
        return player;
    }
    /**
     * Setter for player
     * @return sets player for the piece
     */
    public void setPlayer(Player player) {
        this.player = player;
    }
}
