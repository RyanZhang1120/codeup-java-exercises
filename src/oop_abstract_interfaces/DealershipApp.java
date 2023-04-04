package oop_abstract_interfaces;

public class DealershipApp {

    public static void main(String[] args) {
        //Abstract class: "Vehicle"
        //Vehicle - f strMake; f strModel
        //Automobiles. . f numWheels
        //Watercraft . . f seatingCapacity

        Automobile myTruck = new Automobile("Chevy", "Silverado", 4);
        Automobile reliantRobin = new Automobile("Reliant", "Robin", 3);

        Watercraft bassTracker = new Watercraft("Bass", "Tracker Classic XL", 4);

        Watercraft twoSeater = new Watercraft("Dad's", "Favorite Boat", 2);

        System.out.println(myTruck.logVehicle());
        System.out.println(reliantRobin.logVehicle());
        System.out.println(bassTracker.logVehicle());
        System.out.println(twoSeater.logVehicle());

        System.out.println(myTruck.turnOn());
        System.out.println(bassTracker.turnOn());
    }
}
