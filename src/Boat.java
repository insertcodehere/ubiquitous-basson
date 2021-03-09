public class Boat extends Vehicle {

    private enum BoatType { PADDLE, AIR_BOAT, MOTOR_BOAT };

    private BoatType boatType;

    public constructor(String model, String plate) {
        super(model, plate);
        this.numberOfWheels = 4;
    }

    public getNumberOfWheels() {
        return this.numberOfWheels;
    }

}