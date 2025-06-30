package dzhadyrassyn.coding.challenges.parking.lot;

import dzhadyrassyn.coding.challenges.parking.lot.Vehicle;

public class Motorcycle extends Vehicle {

    public Motorcycle(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.CAR;
    }
}
