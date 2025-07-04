package dzhadyrassyn.coding.challenges.parking.lot;

public class Ticket {

    private final long startTime;
    private long endTime;
    private Vehicle vehicle;

    public Ticket(long startTime) {
        this.startTime = startTime;
    }

    public double countCost() {
        return endTime - startTime;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
