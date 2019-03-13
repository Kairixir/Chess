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

        game.movePiece(Rook,5,3);
        assertEquals(Rook,game.getBoard().getTile(5,3).getPiece());
    }
    @Test
    public void topMovement() throws Exception{
        Game game = new Game();
        Rook rook = new Rook(4,4,game.getPlayer1());

        game.movePiece(rook,3,5);
        assertEquals(rook,game.getBoard().getTile(3,5).getPiece());
    }
    @Test
    public void downMovement() throws Exception{
        Game game = new Game();
        Rook rook = new Rook(4,4,game.getPlayer1());

        game.movePiece(rook,6,6);
        assertEquals(rook,game.getBoard().getTile(6,6).getPiece());
    }
    @Test
    public void capturingPiece()throws Exception{
        Game game = new Game();
        Rook rook = new Rook(4,4,game.getPlayer1());
        Rook rook1 = new Rook(3,3,game.getPlayer2());

        game.movePiece(rook,3,3);
        assertEquals(rook,game.getBoard().getTile(3,3).getPiece());
    }
    @Test(expected = CannotCapturePiece.class)
    public void capturingPieceOfSamePlayer()throws Exception{
        Game game = new Game();
        Rook rook = new Rook(4,4,game.getPlayer1());
        Rook rook1 = new Rook(3,3,game.getPlayer1());

        game.movePiece(rook,3,3);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void movingOverPiece()throws Exception{
        Game game = new Game();
        Rook rook = new Rook(4,4,game.getPlayer1());
        Rook rook1 = new Rook(3,3,game.getPlayer1());

        game.movePiece(rook,2,2);
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
