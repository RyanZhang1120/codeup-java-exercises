package oop_lecture;

public class Vehicle {
    public String make;
    public String model;
    public String color;
    public int year;

    //method - turnOn(); turnOff(); steerVehicle(); accelerateVehicle()

    public String turnOn(){
        return String.format("%s %s turned on successfully! It is a %d and has the color of %s", make, model, year, color);
    }

    //constructor - class will start with a "blank" constructor, we can customize them
    public Vehicle(){};

    //overloaded constructor:
    public Vehicle(String make, String model, String color, int year){
        this.model = model;
        this.make = make;
        this.color = color;
        this.year = year;
    };

    public static void main(String[] args) {
        Vehicle kensTruck = new Vehicle("Chevy", "Silverado", "teal", 2017);

        Vehicle davidDatsun = new Vehicle("Nissan", "Datsun", "black",1987);

        Vehicle danielasFocus = new Vehicle("Ford", "Focus", "Silver", 2014);

        Vehicle anthonysHummer = new Vehicle("GM", "Hummer", "black", 2007);

        System.out.println(kensTruck.turnOn());

        System.out.println(davidDatsun.turnOn());

        System.out.println(danielasFocus.turnOn());

        System.out.println(anthonysHummer.turnOn());
    }

}
