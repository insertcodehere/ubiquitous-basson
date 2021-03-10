public class Boat extends Vehicle {

    private String boatType; // This property could be an enum.

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
