package dzhadyrassyn.coding.challenges.chess.game;

public class ElevatorFacade {

    private Elevator[] elevators;

    public ElevatorFacade(int N) {
        elevators = new Elevator[N];
        for (int i = 0; i < N; i++) {
            elevators[i] = new Elevator(10);
        }
    }

    public void handlePickupRequest(int fromFloor, Direction direction) {
        for (Elevator elevator : elevators) {
            if (elevator.isIdle()) {
                elevator.addPickupRequest(fromFloor, direction);
                break;
            }
        }
    }

    public void stepAll() {
        for (int i = 0; i < elevators.length; i++) {
            elevators[i].step();
            System.out.println("Elevator " + i + ": " + elevators[i]);
        }
    }
}
