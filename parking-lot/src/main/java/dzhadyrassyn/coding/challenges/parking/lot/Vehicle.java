package dzhadyrassyn.coding.challenges.parking.lot;

public abstract class Vehicle {

    private final String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public abstract VehicleType getType();

    public String getLicensePlate() {
        return licensePlate;
    }
}
