package dzhadyrassyn.coding.challenges.parking.lot;

import dzhadyrassyn.coding.challenges.parking.lot.Vehicle;

public class Truck extends Vehicle {

    public Truck(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.TRUCK;
    }
}
