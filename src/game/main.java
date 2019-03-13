package game;

import pieces.Bishop;
import pieces.Knight;
import pieces.Piece;
import pieces.Rook;

public class main {
    public static void main(String[] args) {

        Game game = new Game();
//        Piece bishop = new Bishop(4,4,game.getPlayer1());
//        Piece knight = new Knight(3,3,game.getPlayer2());
        Piece rook = new Rook(3,3,game.getPlayer2());
        System.out.println(game.getBoard().getTile(3,3).getPiece());
        game.movePiece(rook,3,5);
        System.out.println(game.getBoard().getTile(3,5).getPiece());
        System.out.println(game.getBoard().getTile(3,3).getPiece());
        System.out.println(game.getBoard().getTile(4,4).getPiece());
        System.out.println();


    }
}
