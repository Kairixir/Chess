package game;

import pieces.*;

public class main {
    public static void main(String[] args) {

        Game game = new Game();
        Pawn pawn = new Pawn(4,4,game.getPlayer1());


        game.movePiece(pawn,30,30);

    }
}
