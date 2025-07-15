package dzhadyrassyn.coding.challenges.chess.game;

public class Board {

    private final Square[][] board;
    private final int N = 8;
    private final int M = 8;

    public Board() {
        this.board = new Square[N][M];

        setupInitialPositions();
    }

    private void setupInitialPositions() {
        for (int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(i == 1) {
                    board[i][j] = new Square(new Pawn(Color.WHITE), new Position(i, j));
                } else if (i == 6) {
                    board[i][j] = new Square(new Pawn(Color.BLACK), new Position(i, j));
                } else {
                    board[i][j] = new Square(null, new Position(i, j));
                }
            }
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
        return board[position.row()][position.col()];
    }

    public Square getSquare(int row, int col) {
        return board[row][col];
    }

    public void move(Square squareFrom, Square squareTo) {
        Piece piece = squareFrom.getPiece();
        squareFrom.setPiece(null);
        squareTo.setPiece(piece);
    }
}
