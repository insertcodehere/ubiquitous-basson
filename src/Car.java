public class Car extends Vehicle {

    private int numberOfWheels;

    public constructor(String model, String plate) {
        super(model, plate);
        this.numberOfWheels = 4;
    }

    public getNumberOfWheels() {
        return this.numberOfWheels;
    }

}