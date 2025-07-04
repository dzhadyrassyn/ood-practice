package dzhadyrassyn.coding.challenges.chess.game;

public abstract class Piece {

    private final Color color;

    public Piece(Color color) {
        this.color = color;
    }

    public abstract boolean canMove(Square from, Square destination, Board board);

    public Color getColor() {
        return color;
    }
}
