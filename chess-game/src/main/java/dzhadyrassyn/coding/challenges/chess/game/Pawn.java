package dzhadyrassyn.coding.challenges.chess.game;

public class Pawn extends Piece {

    public Pawn(Color color) {
        super(color);
    }

    @Override
    public boolean canMove(Square from, Square destination, Board board) {

        int fromRow = from.getPosition().getRow();
        int fromCol = from.getPosition().getCol();

        int toRow = destination.getPosition().getRow();
        int toCol = destination.getPosition().getCol();

        if (getColor() == Color.WHITE) {
            if (toRow - fromRow > 2) {
                return false;
            }
        }

        if (getColor() == Color.WHITE) {
            for (int i = fromRow + 1; i <= toRow; i++) {
                if (board.getSquare(i, fromCol).isOccupied()) {
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return "P";
    }
}
