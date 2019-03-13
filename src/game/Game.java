package game;

import exception.CannotCapturePiece;
import exception.InvalidPathOfPiece;
import pieces.Piece;

import java.nio.InvalidMarkException;

public class Game {
    private Player player1;
    private Player player2;
    private Board board;

    public Game() {
        player1 = new Player(Colour.WHITE, this);
        player2 = new Player(Colour.BLACK, this);
        board = new Board(8,8);
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Board getBoard() {
        return board;
    }


    /**
     * Moving and capturing pieces
     * @param piece piece to move
     * @param finalX position x to move to
     * @param finalY position y to move to
     */
    public void movePiece(Piece piece, int finalX, int finalY){
        //checks if the path is valid for piece type && if path destination is in the board range
        if(piece.isValidPath(finalX,finalY)&&finalX<board.getTiles().length-1&&finalY<board.getTiles()[0].length-1){

            //gets path that figure has to move
            int[][] path = piece.drawPath(piece.getX(),piece.getY(),finalX,finalY);

            //checks if the path is valid
            if(checkPath(path)){
                //get the starting tile and the final tile
                Tile startingTile = board.getTile(piece.getX(),piece.getY());
                Tile finalTile = board.getTile(path[0][path[0].length-1],path[1][path[1].length-1]);
                if (finalTile.getPiece()==null){
                    //sets the starting path to null and moves the piece to new tile
                    startingTile.setPiece(null);
                    finalTile.setPiece(piece);
                }else if(finalTile.getPiece().getPlayer()==piece.getPlayer()){
                    //if the piece capturing and piece to capture have the same player
                    throw new CannotCapturePiece();
                }else{
                    //capturing piece
                    startingTile.setPiece(null);
                    System.out.println("Piece of player "+finalTile.getPiece().getPlayer()+" of type "+finalTile.getPiece().getType()+" is being captured by "+ piece);
                    finalTile.setPiece(piece);
                }
            }else{
                throw new InvalidPathOfPiece();
            }
            }else{
            throw new InvalidPathOfPiece();
        }
    }

    /**
     * Checks if the path to the final Tile is clear
     * @param path the path that piece have to go through
     * @return true if the path is valid, false if there is any obstacle on the path
     */
    private boolean checkPath(int[][]path){
        for(int i = 0; i<path[0].length-1;i++){
            Tile tileToCheck = board.getTile(path[0][i],path[1][i]);
            if(tileToCheck.getPiece()!=null){
                return false;
            }
        }
        return true;
    }

}
