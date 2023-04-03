package oop_deeper_lectures;

public class Salesperson extends Employee{

    private int dailyPay;

    static int numSalesPeople = 0;

    public Salesperson(String name, int dailyPay){
        super(name);//Call superclass < pass in name, make an instance
        this.dailyPay = dailyPay;
        numSalesPeople++;
    }

    public void doWork(){
        System.out.println("Burning and turning the phone - setting up appts - catching some fresh ups to sell a car");
    }

    //Override (similar to overload) our parent class sayHello


    @Override
    public void sayHello() {
        System.out.printf("Welcome to Howell's Cars - %s is here! What can I help you find? %n", this.getName());
    }

    public int getDailyPay() {
        return dailyPay;
    }
}