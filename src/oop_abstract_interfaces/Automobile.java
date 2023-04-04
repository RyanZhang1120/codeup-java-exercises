package oop_abstract_interfaces;

public class Automobile extends Vehicle{

    private int numWheels;
    public Automobile(String make, String model, int numWheels) {
        super(make, model);
        this.numWheels = numWheels;
    }

    @Override
    public String logVehicle() {

        return String.format("Make: %s | Model: %s | NumWheels: %d %n", super.getMake(), super.getModel(), this.numWheels);
    }

    @Override
    public String turnOn() {
        return String.format("%s %s revs up and turns on - let's hit the road!", super.getMake(), super.getModel());
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
}
