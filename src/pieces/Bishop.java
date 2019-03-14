package pieces;

import game.PieceType;
import game.Player;

public class Bishop extends Piece {



    /**
     * Constructor for Bishop
     * @param x position x of piece
     * @param y position y of piece
     * @param player player that piece belongs to
     */
    public Bishop(int x, int y, Player player) {
        super(x, y, player,PieceType.BISHOP);


    }

    /**
     * Checks if the bishop is moving diagonally
     * @param finalX the final X location
     * @param finalY the final Y location
     * @return a boolean indicating valid path
     */
    @Override
    public boolean isValidPath(int finalX, int finalY) {
        int x_diff = Math.abs(finalX-this.getX());
        int y_diff = Math.abs(finalY-this.getY());

        return x_diff == y_diff;
    }

    /**
     * A function that draws a path from one point to another for Bishop
     * @param startX the initial x location
     * @param startY the initial y location
     * @param finalX the final x location
     * @param finalY the final y location
     * @return array of ints that stands for location change
     */
    @Override
    public int[][] drawPath(int startX, int startY, int finalX, int finalY) {
        return bishopDrawPath(startX, startY, finalX, finalY);
    }

    static int[][] bishopDrawPath(int startX, int startY, int finalX, int finalY) {
        int pairs = Math.abs(finalX-startX);

        int[][] path = new int[2][pairs];

        int x_dir = 1, y_dir = 1;

        if(finalX-startX<0){
            x_dir=-1;
        }
        if(finalY-startY<0){
            y_dir=-1;
        }

        if (pairs>0){
            for (int i=0;i<pairs;i++){
                path[0][i] = startX+x_dir*(i+1);
                path[1][i]=startY+y_dir*(i+1);
            }
        }


        return path;
    }


}
