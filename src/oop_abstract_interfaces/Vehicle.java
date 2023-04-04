package oop_abstract_interfaces;

public abstract class Vehicle implements VehicleInterface{
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

//    public abstract String logVehicle(); //Abstract methods - we don't define the "instructions" here [NO METHOD BODY < NO CURLY BRACES], we have to give the 'instructions' out in the subclass

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //    public static void main(String[] args) {
//
//
//        Vehicle myVehicle = new Vehicle();
//    }

}