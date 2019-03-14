package game;

import pieces.*;

public class main {
    public static void main(String[] args) {

        Game game = new Game();
        Piece rook = new Rook(6,6,game.getPlayer1());


        System.out.println(game.getBoard().getTile(6,6).getPiece());
        game.movePiece(rook,6,6);
        System.out.println(game.getBoard().getTile(6,6).getPiece());
        System.out.println(game.getBoard().getTile(6,7).getPiece());



    }
}
