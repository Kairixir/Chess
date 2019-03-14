package pieces;

import game.Colour;
import game.PieceType;
import game.Player;
import game.Tile;

public class Pawn extends Piece {


    public Pawn(int x, int y, Player player) {
        super(x, y, player,PieceType.PAWN);

    }

    @Override
    public boolean isValidPath(int finalX, int finalY) {
        Tile tileToMove = getPlayer().getGame().getBoard().getTile(finalX,finalY);
        if (getPlayer().getColour()== Colour.WHITE){
            if (Math.abs(finalX-getX())==1&&finalY-getY()==1){


                return tileToMove.getPiece()!=null;

            }else if (finalX-getX()==0&&finalY-getY()==1){
                return tileToMove.getPiece()==null;
            }
        }else{
            if (Math.abs(finalX-getX())==1&&finalY-getY()==-1){


                return tileToMove.getPiece()!=null;

            }else if (finalX-getX()==0&&finalY-getY()==-1){
                return tileToMove.getPiece()==null;
            }
        }
       return false;
    }

    @Override
    public int[][] drawPath(int startX, int startY, int finalX, int finalY) {
        int[][] path = new int[2][1];
        path[0][0] = finalX;
        path[1][0] = finalY;
        return path;
    }


}
