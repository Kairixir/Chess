package test;


import exception.CannotCapturePiece;
import exception.InvalidPathOfPiece;
import game.Game;
import org.junit.Test;
import pieces.King;

import static org.junit.Assert.assertEquals;

public class KingTest {

    @Test
    public void topMovement() throws Exception{
        Game game = new Game();
        King king = new King(4,4,game.getPlayer1());

        game.movePiece(king,4,3);
        assertEquals(king,game.getBoard().getTile(4,3).getPiece());
    }
    @Test
    public void downMovement() throws Exception{
        Game game = new Game();
        King king = new King(4,4,game.getPlayer1());

        game.movePiece(king,4,5);
        assertEquals(king,game.getBoard().getTile(4,5).getPiece());
    }
    @Test
    public void leftMovements() throws Exception{
        Game game = new Game();
        King king = new King(4,4,game.getPlayer1());

        game.movePiece(king,3,5);
        game.movePiece(king,2,4);
        game.movePiece(king,1,4);
        assertEquals(king,game.getBoard().getTile(1,4).getPiece());
    }
    @Test
    public void rightMovements() throws Exception{
        Game game = new Game();
        King king = new King(4,4,game.getPlayer1());

        game.movePiece(king,5,4);
        game.movePiece(king,6,5);
        game.movePiece(king,7,4);
        assertEquals(king,game.getBoard().getTile(7,4).getPiece());
    }
    @Test
    public void capturingPiece()throws Exception{
        Game game = new Game();
        King king = new King(4,4,game.getPlayer1());
        King king1 = new King(3,3,game.getPlayer2());

        game.movePiece(king,3,3);
        assertEquals(king,game.getBoard().getTile(3,3).getPiece());
    }
    @Test(expected = CannotCapturePiece.class)
    public void capturingPieceOfSamePlayer()throws Exception{
        Game game = new Game();
        King king = new King(4,4,game.getPlayer1());
        King king1 = new King(3,3,game.getPlayer1());

        game.movePiece(king,3,3);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void movingOverPiece()throws Exception{
        Game game = new Game();
        King king = new King(4,4,game.getPlayer1());
        King king1 = new King(3,3,game.getPlayer1());

        game.movePiece(king,2,2);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void invalidMovement()throws Exception{
        Game game = new Game();
        King king = new King(4,4,game.getPlayer1());


        game.movePiece(king,6,4);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void outOfBounds()throws Exception{
        Game game = new Game();
        King king = new King(4,4,game.getPlayer1());


        game.movePiece(king,30,30);
    }
}
