package dzhadyrassyn.coding.challenges.chess.game;

public class Pawn extends Piece {

    public Pawn(Color color) {
        super(color);
    }

    @Override
    public boolean canMove(Square from, Square to, Board board) {

        int fromRow = from.getPosition().row();
        int fromCol = from.getPosition().col();
        int toRow = to.getPosition().row();
        int toCol = to.getPosition().col();

        int direction = getColor() == Color.WHITE ? 1 : -1;
        int startRow = getColor() == Color.WHITE ? 1 : 6;

        if (fromCol != toCol) {
            if (Math.abs(fromCol - toCol) == 1 && toRow - fromRow == direction) {
                return to.isOccupied() && to.getPiece().getColor() != this.getColor();
            }
            return false;
        }

        if ((toRow - fromRow) * direction <= 0) {
            return false;
        }

        if (toRow - fromRow == direction && !to.isOccupied()) {
            return true;
        }

        if (fromRow == startRow && toRow - fromRow == 2 * direction) {
            int midRow = fromRow + direction;
            return !board.getSquare(midRow, fromCol).isOccupied() && !to.isOccupied();
        }

        return false;
    }

    @Override
    public String toString() {
        return "P";
    }
}
