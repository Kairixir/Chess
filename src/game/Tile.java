package game;


import pieces.Piece;

public class Tile {
    private Piece piece;


    public Tile() {
    }

    public Tile(Piece piece) {
        this.piece = piece;

    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }


}
