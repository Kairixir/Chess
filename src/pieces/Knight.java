package pieces;

import game.PieceType;
import game.Player;

public class Knight extends Piece {



    public Knight(int x, int y, Player player) {
        super(x, y, player, PieceType.KNIGHT);
    }

    @Override
    public boolean isValidPath(int finalX, int finalY) {
        return Math.abs(finalX-getX())==2&&Math.abs(finalY-getY())==1||Math.abs(finalX-getX())==1&&Math.abs(finalY-getY())==2;
    }

    @Override
    public int[][] drawPath(int startX, int startY, int finalX, int finalY) {
        int[][] path = new int[2][1];
        path[0][0] = finalX;
        path[1][0] = finalY;

        return path;
    }
}
