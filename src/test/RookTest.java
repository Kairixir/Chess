package test;


import exception.CannotCapturePiece;
import exception.InvalidPathOfPiece;
import game.Game;
import org.junit.Test;
import pieces.Rook;
import pieces.Rook;

import static org.junit.Assert.assertEquals;

public class RookTest {

    @Test
    public void leftMovement() throws Exception{
        Game game = new Game();
        Rook rook = new Rook(4,4,game.getPlayer1());

        game.movePiece(rook,2,4);
        assertEquals(rook,game.getBoard().getTile(2,4).getPiece());
    }
    @Test
    public void rightMovement() throws Exception{
        Game game = new Game();
        Rook Rook = new Rook(4,4,game.getPlayer1());

        game.movePiece(Rook,5,4);
        assertEquals(Rook,game.getBoard().getTile(5,4).getPiece());
    }
    @Test
    public void topMovement() throws Exception{
        Game game = new Game();
        Rook rook = new Rook(4,4,game.getPlayer1());

        game.movePiece(rook,4,3);
        assertEquals(rook,game.getBoard().getTile(4,3).getPiece());
    }
    @Test
    public void downMovement() throws Exception{
        Game game = new Game();
        Rook rook = new Rook(4,4,game.getPlayer1());

        game.movePiece(rook,4,5);
        assertEquals(rook,game.getBoard().getTile(4,5).getPiece());
    }
    @Test
    public void capturingPiece()throws Exception{
        Game game = new Game();
        Rook rook = new Rook(4,4,game.getPlayer1());
        Rook rook1 = new Rook(4,3,game.getPlayer2());

        game.movePiece(rook,4,3);
        assertEquals(rook,game.getBoard().getTile(4,3).getPiece());
    }
    @Test(expected = CannotCapturePiece.class)
    public void capturingPieceOfSamePlayer()throws Exception{
        Game game = new Game();
        Rook rook = new Rook(4,4,game.getPlayer1());
        Rook rook1 = new Rook(5,4,game.getPlayer1());

        game.movePiece(rook,5,4);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void movingOverPiece()throws Exception{
        Game game = new Game();
        Rook rook = new Rook(4,4,game.getPlayer1());
        Rook rook1 = new Rook(6,4,game.getPlayer1());

        game.movePiece(rook,7,4);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void invalidMovement()throws Exception{
        Game game = new Game();
        Rook rook = new Rook(4,4,game.getPlayer1());


        game.movePiece(rook,5,7);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void outOfBounds()throws Exception{
        Game game = new Game();
        Rook rook = new Rook(4,4,game.getPlayer1());


        game.movePiece(rook,30,30);
    }
}
