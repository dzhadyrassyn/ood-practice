package dzhadyrassyn.coding.challenges.chess.game;

public class Pawn extends Piece {

    public Pawn(Color color) {
        super(color);
    }

    @Override
    public boolean canMove(Square destination) {
        return false;
    }

    @Override
    public String toString() {
        return "P";
    }
}
