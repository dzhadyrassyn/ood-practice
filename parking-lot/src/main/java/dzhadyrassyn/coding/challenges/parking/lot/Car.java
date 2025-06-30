package dzhadyrassyn.coding.challenges.parking.lot;

import dzhadyrassyn.coding.challenges.parking.lot.Vehicle;
import dzhadyrassyn.coding.challenges.parking.lot.VehicleType;

public class Car extends Vehicle {

    public Car(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.CAR;
    }
}
