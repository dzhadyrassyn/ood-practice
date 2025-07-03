package dzhadyrassyn.coding.challenges.chess.game;

public class Game {

    private final Board board;
    private Player currentPlayer;

    public Game() {
        board = new Board();
        currentPlayer = Player.ONE;
    }

    public void move(Position from, Position to) {

        currentPlayer = currentPlayer ==  Player.ONE ? Player.TWO : Player.ONE;

        Square squareFrom = board.getSquare(from);
        Square squareTo = board.getSquare(to);

        if (squareFrom.getPiece() != null && squareFrom.getPiece().canMove(squareTo)) {
            board.move(squareFrom, squareTo);
        }
    }

    public void printBoard() {
        board.printBoard();
    }
}
