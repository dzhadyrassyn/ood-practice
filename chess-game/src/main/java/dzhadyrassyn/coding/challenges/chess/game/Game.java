package dzhadyrassyn.coding.challenges.chess.game;

public class Game {

    private Board board;
    private Player currentPlayer;

    public Game() {
        board = new Board();
    }

    public void move(Position from, Position to) {
    }

    public void printBoard() {
        board.printBoard();
    }
}
