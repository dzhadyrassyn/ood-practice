package dzhadyrassyn.coding.challenges.chess.game;

public class Square {

    private Piece piece;
    private Position position;

    public Square(Piece piece, Position position) {
        this.piece = piece;
        this.position = position;
    }

    public boolean isOccupied() {
        return this.position == null;
    }

    public Piece getPiece() {
        return piece;
    }

}
