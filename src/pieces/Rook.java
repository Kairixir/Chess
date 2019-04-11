package pieces;

import game.PieceType;
import game.Player;

public class Rook extends Piece {


     /**
     * Constructor for piece
     *
     * @param x      position x of piece
     * @param y      position y of piece
     * @param player player that piece belongs to
     */
    public Rook(int x, int y, Player player) {
        super(x, y, player, PieceType.ROOK);
    }


    @Override
    public boolean isValidPath(int finalX, int finalY) {
        return finalX==getX()||finalY==getY();
    }

    @Override
    public int[][] drawPath(int startX, int startY, int finalX, int finalY) {
       return rookDrawPath(startX, startY, finalX, finalY);

    }

    static int[][] rookDrawPath(int startX, int startY, int finalX, int finalY) {
        int xMove = Math.abs(finalX-startX);
        int yMove = Math.abs(finalY-startY);

        if(xMove>0){
            int x_dir = 1;
            if (finalX-startX<0){
                x_dir = -1;
            }
            int[][] path = new int[2][xMove];
            for (int i=0;i<xMove;i++){
                path[0][i]=startX+x_dir*(i+1);
                path[1][i]=startY;
            }
            return path;
        }
        if(yMove>0){
            int y_dir = 1;
            if (finalY-startY<0){
                y_dir = -1;
            }
            int[][] path = new int[2][yMove];
            for (int i=0;i<yMove;i++){
                path[1][i]=startY+y_dir*(i+1);
                path[0][i]=startX;
            }
            return path;
        }
        return null;
    }
}
