package oop_abstract_interfaces;

public class Watercraft extends Vehicle{

    private int seatingCapacity;

    public Watercraft(String make, String model, int seatingCapacity) {
        super(make, model);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String logVehicle() {
        return String.format("Make: %s | Model: %s | Seating Capacity: %d %n", super.getMake(), super.getModel(), this.seatingCapacity);
    }

    @Override
    public String turnOn() {

        return String.format("%s %s revs up and is turned on! Nice time to hit the waves!", super.getMake(), super.getModel());
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
}
