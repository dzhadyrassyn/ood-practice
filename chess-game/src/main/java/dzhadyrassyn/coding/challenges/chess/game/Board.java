package dzhadyrassyn.coding.challenges.chess.game;

public class Board {

    private final Square[][] board;
    private final int N = 8;
    private final int M = 8;

    public Board() {
        board = new Square[N][M];

        initBoard();
    }

    private void initBoard() {

        for(int j = 0; j < M; j++) {
            board[1][j] = new Square(new Pawn(Color.WHITE), new Position(1, j));
        }

        for(int j = 0; j < M; j++) {
            board[6][j] = new Square(new Pawn(Color.BLACK), new Position(6, j));
        }
    }

    public void printBoard() {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < M; col++) {
                if (board[row][col] != null && board[row][col].getPiece() != null) {
                    System.out.print(board[row][col].getPiece());
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    public Square getSquare(Position position) {
        return board[position.getRow()][position.getCol()];
    }

    public void move(Square squareFrom, Square squareTo) {
        Piece piece = squareFrom.getPiece();
        squareFrom.setPiece(null);

        squareTo.setPiece(piece);
    }
}
