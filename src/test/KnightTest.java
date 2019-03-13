package test;


import exception.CannotCapturePiece;
import exception.InvalidPathOfPiece;
import game.Game;
import org.junit.Test;
import pieces.Knight;
import pieces.Knight;
import pieces.Piece;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    @Test
    public void downLeftMovementOne() throws Exception{
        Game game = new Game();
        Piece knight = new Knight(3,3,game.getPlayer1());

        game.movePiece(knight,2,5);
        assertEquals(knight,game.getBoard().getTile(2,5).getPiece());
    }
    @Test
    public void downLeftMovementTwo() throws Exception{
        Game game = new Game();
        Piece knight = new Knight(3,3,game.getPlayer1());

        game.movePiece(knight,1,4);
        assertEquals(knight,game.getBoard().getTile(1,4).getPiece());
    }
    @Test
    public void downRightMovementOne() throws Exception{
        Game game = new Game();
        Knight knight = new Knight(3,3,game.getPlayer1());

        game.movePiece(knight,4,5);
        assertEquals(knight,game.getBoard().getTile(4,5).getPiece());
    }
    @Test
    public void downRightMovementTwo() throws Exception{
        Game game = new Game();
        Knight knight = new Knight(3,3,game.getPlayer1());

        game.movePiece(knight,5,4);
        assertEquals(knight,game.getBoard().getTile(5,4).getPiece());
    }
    @Test
    public void topLeftMovementOne() throws Exception{
        Game game = new Game();
        Knight knight = new Knight(3,3,game.getPlayer1());

        game.movePiece(knight,1,2);
        assertEquals(knight,game.getBoard().getTile(1,2).getPiece());
    }
    @Test
    public void topLeftMovementTwo() throws Exception{
        Game game = new Game();
        Knight knight = new Knight(3,3,game.getPlayer1());

        game.movePiece(knight,2,1);
        assertEquals(knight,game.getBoard().getTile(2,1).getPiece());
    }
    @Test
    public void topRightMovementOne() throws Exception{
        Game game = new Game();
        Knight knight = new Knight(3,3,game.getPlayer1());

        game.movePiece(knight,4,1);
        assertEquals(knight,game.getBoard().getTile(4,1).getPiece());
    }
    @Test
    public void topRightMovementTwo() throws Exception{
        Game game = new Game();
        Knight knight = new Knight(3,3,game.getPlayer1());

        game.movePiece(knight,5,2);
        assertEquals(knight,game.getBoard().getTile(5,2).getPiece());
    }
    @Test
    public void capturingPiece()throws Exception{
        Game game = new Game();
        Knight knight = new Knight(3,3,game.getPlayer1());
        Knight knight1 = new Knight(2,1,game.getPlayer2());

        game.movePiece(knight,2,1);
        assertEquals(knight,game.getBoard().getTile(2,1).getPiece());
    }
    @Test(expected = CannotCapturePiece.class)
    public void capturingPieceOfSamePlayer()throws Exception{
        Game game = new Game();
        Knight knight = new Knight(3,3,game.getPlayer1());
        Knight knight1 = new Knight(2,1,game.getPlayer1());

        game.movePiece(knight,2,1);
    }
    @Test
    public void movingOverPiece()throws Exception{
        Game game = new Game();
        Knight knight = new Knight(3,3,game.getPlayer1());
        Knight knight1 = new Knight(2,2,game.getPlayer1());
        Knight knight2 = new Knight(2,3,game.getPlayer1());
        Knight knight3 = new Knight(3,2,game.getPlayer1());
        Knight knight4 = new Knight(3,1,game.getPlayer1());
        Knight knight5 = new Knight(1,3,game.getPlayer1());


        game.movePiece(knight,2,1);
        assertEquals(knight,game.getBoard().getTile(2,1).getPiece());
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void invalidMovementOne()throws Exception{
        Game game = new Game();
        Knight knight = new Knight(3,3,game.getPlayer1());


        game.movePiece(knight,3,1);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void invalidMovementTwo()throws Exception{
        Game game = new Game();
        Knight knight = new Knight(3,3,game.getPlayer1());


        game.movePiece(knight,1,1);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void outOfBounds()throws Exception{
        Game game = new Game();
        Knight knight = new Knight(7,7,game.getPlayer1());


        game.movePiece(knight,9,8);
    }
}
