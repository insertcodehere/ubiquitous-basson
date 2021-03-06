public class Boat extends Vehicle {

    // Think about making this an enum
    private String boatType;

    public Boat(String model, String plate) {
        super(model, plate);
        this.boatType = "Motor boat";
    }

    public String getBoatType() {
        return this.boatType;
    }
    
    @Override
    public String toString() {
        return "This is a super " + this.getBoatType() + "!";
    }

}
