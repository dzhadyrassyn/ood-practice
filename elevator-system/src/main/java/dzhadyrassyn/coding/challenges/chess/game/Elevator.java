package dzhadyrassyn.coding.challenges.chess.game;

import java.util.LinkedList;
import java.util.Queue;

public class Elevator {

    private State state;
    private int currentFloor;
    private int maxFloor;
    private Direction direction;
    private Queue<PickupRequest> pickupRequests = new LinkedList<>();

    public Elevator(int maxFloor) {
        this.state = State.IDLE;
        this.currentFloor = 1;
        this.maxFloor = maxFloor;
        this.direction = Direction.NONE;
    }

    public void addPickupRequest(int floor, Direction direction) {
        pickupRequests.add(new PickupRequest(floor, direction));
    }

    public void step() {
        if (pickupRequests.isEmpty()) {
            this.state = State.IDLE;
            return;
        }

        PickupRequest pickupRequest = pickupRequests.peek();
        if (pickupRequest.floor() > currentFloor) {
            this.currentFloor++;
            this.state = State.MOVING_UP;
        } else if (pickupRequest.floor() < currentFloor) {
            this.currentFloor--;
            this.state = State.MOVING_DOWN;
        } else {
            this.state = State.DOORS_OPEN;
            pickupRequests.poll();
        }
    }

    public boolean isIdle() {
        return this.state == State.IDLE;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "state=" + state +
                ", currentFloor=" + currentFloor +
                '}';
    }
}
