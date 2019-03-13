package pieces;

import game.PieceType;
import game.Player;

public class Pawn extends Piece {


    public Pawn(int x, int y, Player player) {
        super(x, y, player,PieceType.PAWN);

    }

    @Override
    public boolean isValidPath(int finalX, int finalY) {
        getPlayer().getGame().getBoard().getTile(finalX,finalY).getPiece();
return false;
    }

    @Override
    public int[][] drawPath(int startX, int startY, int finalX, int finalY) {
        return null;
    }


}
