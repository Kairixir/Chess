package test;


import exception.CannotCapturePiece;
import exception.InvalidPathOfPiece;
import game.Game;
import org.junit.Test;
import pieces.Queen;

import static org.junit.Assert.assertEquals;

public class QueenTest {


    @Test
    public void leftMovement() throws Exception{
        Game game = new Game();
        Queen queen = new Queen(4,4,game.getPlayer1());

        game.movePiece(queen,2,4);
        assertEquals(queen,game.getBoard().getTile(2,4).getPiece());
    }
    @Test
    public void rightMovement() throws Exception{
        Game game = new Game();
        Queen Queen = new Queen(4,4,game.getPlayer1());

        game.movePiece(Queen,5,4);
        assertEquals(Queen,game.getBoard().getTile(5,4).getPiece());
    }
    @Test
    public void topMovement() throws Exception{
        Game game = new Game();
        Queen queen = new Queen(4,4,game.getPlayer1());

        game.movePiece(queen,4,3);
        assertEquals(queen,game.getBoard().getTile(4,3).getPiece());
    }
    @Test
    public void downMovement() throws Exception{
        Game game = new Game();
        Queen queen = new Queen(4,4,game.getPlayer1());

        game.movePiece(queen,4,5);
        assertEquals(queen,game.getBoard().getTile(4,5).getPiece());
    }
    @Test
    public void downLeftMovement() throws Exception{
        Game game = new Game();
        Queen queen = new Queen(4,4,game.getPlayer1());

        game.movePiece(queen,2,2);
        assertEquals(queen,game.getBoard().getTile(2,2).getPiece());
    }
    @Test
    public void downRightMovement() throws Exception{
        Game game = new Game();
        Queen queen = new Queen(4,4,game.getPlayer1());

        game.movePiece(queen,5,3);
        assertEquals(queen,game.getBoard().getTile(5,3).getPiece());
    }
    @Test
    public void topLeftMovement() throws Exception{
        Game game = new Game();
        Queen queen = new Queen(4,4,game.getPlayer1());

        game.movePiece(queen,3,5);
        assertEquals(queen,game.getBoard().getTile(3,5).getPiece());
    }
    @Test
    public void topRightMovement() throws Exception{
        Game game = new Game();
        Queen queen = new Queen(4,4,game.getPlayer1());

        game.movePiece(queen,6,6);
        assertEquals(queen,game.getBoard().getTile(6,6).getPiece());
    }
    @Test
    public void capturingPiece()throws Exception{
        Game game = new Game();
        Queen queen = new Queen(4,4,game.getPlayer1());
        Queen queen1 = new Queen(3,3,game.getPlayer2());

        game.movePiece(queen,3,3);
        assertEquals(queen,game.getBoard().getTile(3,3).getPiece());
    }
    @Test(expected = CannotCapturePiece.class)
    public void capturingPieceOfSamePlayer()throws Exception{
        Game game = new Game();
        Queen queen = new Queen(4,4,game.getPlayer1());
        Queen queen1 = new Queen(3,3,game.getPlayer1());

        game.movePiece(queen,3,3);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void movingOverPiece()throws Exception{
        Game game = new Game();
        Queen queen = new Queen(4,4,game.getPlayer1());
        Queen queen1 = new Queen(3,3,game.getPlayer1());

        game.movePiece(queen,2,2);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void invalidMovement()throws Exception{
        Game game = new Game();
        Queen queen = new Queen(4,4,game.getPlayer1());


        game.movePiece(queen,5,7);
    }
    @Test(expected = InvalidPathOfPiece.class)
    public void outOfBounds()throws Exception{
        Game game = new Game();
        Queen queen = new Queen(4,4,game.getPlayer1());


        game.movePiece(queen,30,30);
    }
}
