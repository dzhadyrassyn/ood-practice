package dzhadyrassyn.coding.challenges.chess.game;

public class Main {
    public static void main(String[] args) {

        ElevatorFacade elevatorFacade = new ElevatorFacade(2);
        elevatorFacade.handlePickupRequest(3, Direction.UP);
        elevatorFacade.handlePickupRequest(7, Direction.DOWN);
        for (int i = 0; i < 10; i++) {
            elevatorFacade.stepAll();
        }
    }
}