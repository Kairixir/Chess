package pieces;

import game.PieceType;
import game.Player;

public class King extends Piece {

    public King(int x, int y, Player player) {
        super(x, y, player, PieceType.KING);
    }

    @Override
    public boolean isValidPath(int finalX, int finalY) {
        boolean rightMove = finalX-getX()==1&&(finalY-getY()==1||finalY-getY()==0||finalY-getY()==-1);
        boolean middleMove = finalX-getX()==0&&(finalY-getY()==1||finalY-getY()==-1);
        boolean leftMove = finalX-getX()==-1&&(finalY-getY()==1||finalY-getY()==0||finalY-getY()==-1);

        if (rightMove||middleMove||leftMove){
            return true;
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
