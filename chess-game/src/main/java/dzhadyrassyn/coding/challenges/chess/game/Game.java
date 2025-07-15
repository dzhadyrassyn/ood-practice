package dzhadyrassyn.coding.challenges.chess.game;

public class Game {

    private final Board board;
    private final Player whitePlayer;
    private final Player blackPlayer;
    private Player currentPlayer;

    public Game() {
        board = new Board();
        whitePlayer = new Player("White", Color.WHITE);
        blackPlayer = new Player("Black", Color.BLACK);
        currentPlayer = whitePlayer;
    }

    public boolean move(Position from, Position to) {

        Square fromSquare = board.getSquare(from);
        Square toSquare = board.getSquare(to);
        Piece piece = fromSquare.getPiece();

        if (piece == null) {
            System.out.println("No piece at source position.");
            return false;
        }

        if (piece.getColor() != currentPlayer.color()) {
            System.out.println("It's not your turn");
            return false;
        }

        if (!piece.canMove(fromSquare, toSquare, board)) {
            System.out.println("Invalid move for " + piece.getClass().getSimpleName());
            return false;
        }

        board.move(fromSquare, toSquare);
        switchTurn();
        return true;
    }

    private void switchTurn() {
        currentPlayer = currentPlayer ==  blackPlayer ? whitePlayer : blackPlayer;
        System.out.println("It's " + currentPlayer.name() + "'s turn.");
    }

    public void printBoard() {
        board.printBoard();
    }
}
