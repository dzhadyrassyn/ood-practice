package dzhadyrassyn.coding.challenges.parking.lot;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Parking Lot");

        Parking parking = new Parking();
        Floor floor = new Floor();
        floor.addParkingSpace(new ParkingSpace(VehicleType.CAR));
        floor.addParkingSpace(new ParkingSpace(VehicleType.TRUCK));
        floor.addParkingSpace(new ParkingSpace(VehicleType.CAR));
        parking.addFloor(floor);

        ParkingManagerFacade parkingManager = new ParkingManagerFacade(parking);
        parkingManager.parkVehicle(new Car("123-CAR"));
        parkingManager.parkVehicle(new Truck("123-TRUCK"));

        System.out.println(parkingManager.getAvailableSlots());

    }
}