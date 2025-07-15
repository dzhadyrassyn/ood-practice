package dzhadyrassyn.coding.challenges.chess.game;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chess Game");

        Game game = new Game();

        game.move(new Position(1, 1), new Position(3, 1));

        game.move(new Position(6, 2), new Position(4, 2));
        game.printBoard();

        game.move(new Position(3, 1), new Position(4, 2));
        game.printBoard();
    }
}