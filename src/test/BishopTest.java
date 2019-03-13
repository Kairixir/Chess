package test;


import exception.CannotCapturePiece;
import exception.InvalidPathOfPiece;
import game.Game;
import org.junit.Test;
import pieces.Bishop;
import pieces.Piece;

import static org.junit.Assert.assertEquals;

public class BishopTest {

    @Test
    public void downLeftMovement() throws Exception{
        Game game = new Game();
        Bishop bishop = new Bishop(4,4,game.getPlayer1());

        game.movePiece(bishop,2,2);
        assertEquals(bishop,game.getBoard().getTile(2,2).getPiece());
    }
    @Test
    public void downRightMovement() throws Exception{
        Game game = new Game();
        Bishop bishop = new Bishop(4,4,game.getPlayer1());

        game.movePiece(bishop,5,3);
        assertEquals(bishop,game.getBoard().getTile(5,3).getPiece());
    }
    @Test
    public void topLeftMovement() throws Exception{
        Game game = new Game();
        Bishop bishop = new Bishop(4,4,game.getPlayer1());

        game.movePiece(bishop,3,5);
        assertEquals(bishop,game.getBoard().getTile(3,5).getPiece());
    }
    @Test
    public void topRightMovement() throws Exception{
        Game game = new Game();
        Bishop bishop = new Bishop(4,4,game.getPlayer1());

        game.movePiece(bishop,6,6);
        assertEquals(bishop,game.getBoard().getTile(6,6).getPiece());
    }
    @Test
    public void capturingPiece()throws Exception{
        Game game = new Game();
        Bishop bishop = new Bishop(4,4,game.getPlayer1());
        Bishop bishop1 = new Bishop(3,3,game.getPlayer2());

        game.movePiece(bishop,3,3);
        assertEquals(bishop,game.getBoard().getTile(3,3).getPiece());
    }
    @Test(expected = CannotCapturePiece.class)
    public void capturingPieceOfSamePlayer()throws Exception{
        Game game = new Game();
        Bishop bishop = new Bishop(4,4,game.getPlayer1());
        Bishop bishop1 = new Bishop(3,3,game.getPlayer1());

        game.movePiece(bishop,3,3);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void movingOverPiece()throws Exception{
        Game game = new Game();
        Bishop bishop = new Bishop(4,4,game.getPlayer1());
        Bishop bishop1 = new Bishop(3,3,game.getPlayer1());

        game.movePiece(bishop,2,2);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void invalidMovement()throws Exception{
        Game game = new Game();
        Bishop bishop = new Bishop(4,4,game.getPlayer1());


        game.movePiece(bishop,5,7);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void outOfBounds()throws Exception{
        Game game = new Game();
        Bishop bishop = new Bishop(4,4,game.getPlayer1());


        game.movePiece(bishop,30,30);
    }
}
