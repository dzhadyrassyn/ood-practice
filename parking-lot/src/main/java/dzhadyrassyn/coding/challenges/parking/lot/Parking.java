package dzhadyrassyn.coding.challenges.parking.lot;

import dzhadyrassyn.coding.challenges.parking.lot.Floor;
import dzhadyrassyn.coding.challenges.parking.lot.ParkingSpace;
import dzhadyrassyn.coding.challenges.parking.lot.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Parking {

    private final List<Floor> floors = new ArrayList<>();

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public Optional<ParkingSpace> findSlot(Vehicle vehicle) {
        return floors.stream().flatMap(it -> it.getAvailableSlot(vehicle).stream()).findFirst();
    }

    public List<Floor> getFloors() {
        return this.floors;
    }
}
