package dzhadyrassyn.coding.challenges.chess.game;

public class Square {

    private Piece piece;
    private Position position;

    public Square(Piece piece, Position position) {
        this.piece = piece;
        this.position = position;
    }

    public boolean isOccupied() {
        return this.piece != null;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Position getPosition() {
        return position;
    }
}
