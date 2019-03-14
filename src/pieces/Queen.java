package pieces;

import game.PieceType;
import game.Player;

import static pieces.Bishop.bishopDrawPath;
import static pieces.Rook.rookDrawPath;

public class Queen extends Piece {
    public Queen(Player player) {
        super(player);
    }

    public Queen(int x, int y, Player player) {
        super(x, y, player, PieceType.QUEEN);
    }

    @Override
    public boolean isValidPath(int finalX, int finalY) {
        int x_diff = Math.abs(finalX-this.getX());
        int y_diff = Math.abs(finalY-this.getY());

        return finalX==getX()||finalY==getY()||x_diff==y_diff;
    }

    @Override
    public int[][] drawPath(int startX, int startY, int finalX, int finalY) {
        if (finalX != startX && finalY != startY) {

            return bishopDrawPath(startX, startY, finalX, finalY);
        }else{
            return rookDrawPath(startX,startY,finalX,finalY);
        }
    }
}
