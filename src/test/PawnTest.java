package test;


import exception.CannotCapturePiece;
import exception.InvalidPathOfPiece;
import game.Game;
import org.junit.Test;
import pieces.Pawn;

import static org.junit.Assert.assertEquals;

public class PawnTest {

    @Test
    public void whitePlayerMovement() throws Exception{
        Game game = new Game();
        Pawn pawn = new Pawn(4,4,game.getPlayer1());

        game.movePiece(pawn,4,5);
        assertEquals(pawn,game.getBoard().getTile(4,5).getPiece());
    }
    @Test
    public void whitePlayerCaptureMovement() throws Exception{
        Game game = new Game();
        Pawn pawn = new Pawn(4,4,game.getPlayer1());
        Pawn pawn1 = new Pawn(5,5,game.getPlayer2());

        game.movePiece(pawn,5,5);
        assertEquals(pawn,game.getBoard().getTile(5,5).getPiece());
    }
    @Test
    public void whitePlayerCaptureMovementTwo() throws Exception{
        Game game = new Game();
        Pawn pawn = new Pawn(4,4,game.getPlayer1());
        Pawn pawn1 = new Pawn(3,5,game.getPlayer2());

        game.movePiece(pawn,3,5);
        assertEquals(pawn,game.getBoard().getTile(3,5).getPiece());
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void whiteBlockedMovement() throws Exception{
        Game game = new Game();
        Pawn pawn = new Pawn(4,4,game.getPlayer1());
        Pawn pawn1 = new Pawn(4,5,game.getPlayer2());

        game.movePiece(pawn,4,5);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void whiteBackwardMovement() throws Exception{
        Game game = new Game();
        Pawn pawn = new Pawn(4,4,game.getPlayer1());

        game.movePiece(pawn,4,3);
    }
    @Test
    public void blackPlayerMovement()throws Exception{
        Game game = new Game();
        Pawn pawn = new Pawn(4,4,game.getPlayer2());


        game.movePiece(pawn,4,3);
        assertEquals(pawn,game.getBoard().getTile(4,3).getPiece());
    }
    @Test
    public void blackPlayerCaptureMovement() throws Exception{
        Game game = new Game();
        Pawn pawn = new Pawn(5,5,game.getPlayer2());
        Pawn pawn1 = new Pawn(4,4,game.getPlayer1());

        game.movePiece(pawn,4,4);
        assertEquals(pawn,game.getBoard().getTile(4,4).getPiece());
    }
    @Test
    public void blackPlayerCaptureMovementTwo() throws Exception{
        Game game = new Game();
        Pawn pawn = new Pawn(5,5,game.getPlayer2());
        Pawn pawn1 = new Pawn(6,4,game.getPlayer1());

        game.movePiece(pawn,6,4);
        assertEquals(pawn,game.getBoard().getTile(6,4).getPiece());
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void blackBlockedMovement() throws Exception{
        Game game = new Game();
        Pawn pawn = new Pawn(4,5,game.getPlayer2());
        Pawn pawn1 = new Pawn(4,4,game.getPlayer1());

        game.movePiece(pawn,4,4);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void blackBackwardMovement() throws Exception{
        Game game = new Game();
        Pawn pawn = new Pawn(4,4,game.getPlayer2());

        game.movePiece(pawn,4,5);
    }
    @Test(expected = CannotCapturePiece.class)
    public void capturingPieceOfSamePlayer()throws Exception{
        Game game = new Game();
        Pawn pawn = new Pawn(4,4,game.getPlayer1());
        Pawn pawn1 = new Pawn(5,5,game.getPlayer1());

        game.movePiece(pawn,5,5);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void movingOverPiece()throws Exception{
        Game game = new Game();
        Pawn pawn = new Pawn(4,3,game.getPlayer1());
        Pawn pawn1 = new Pawn(4,4,game.getPlayer1());

        game.movePiece(pawn,4,5);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void invalidMovement()throws Exception{
        Game game = new Game();
        Pawn pawn = new Pawn(4,4,game.getPlayer1());


        game.movePiece(pawn,5,6);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void outOfBounds()throws Exception{
        Game game = new Game();
        Pawn pawn = new Pawn(4,4,game.getPlayer1());


        game.movePiece(pawn,30,30);
    }
}
