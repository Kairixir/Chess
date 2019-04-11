package game;


import pieces.Piece;

public class Tile {
    private Piece piece;
    private int X;
    private int Y;


    public Tile(int X,int Y) {
        this.X = X;
        this.Y = Y;
    }

    public Tile(Piece piece) {
        this.piece = piece;

    }

    public void setPiece(Piece piece) {
        this.piece = piece;
        if (piece != null){
        piece.setX(this.X);
        piece.setY(this.Y);
        }
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public Piece getPiece() {
        return piece;
    }


}
