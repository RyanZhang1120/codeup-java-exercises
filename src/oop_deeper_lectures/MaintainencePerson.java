package oop_deeper_lectures;

public class MaintainencePerson extends Employee {

    private int dailyPay;

    static int numMaintPeople = 0;
    public MaintainencePerson(String name, int dailyPay){
        super(name); //Call superclass < pass in name, make an instance
        this.dailyPay = dailyPay;
        numMaintPeople++;
    }

    @Override
    public void sayHello() {
        System.out.printf("Whoa I'm just moving the cars - my name is %s I don't know much about them, but I can help you get a salesperson real quick! %n", this.getName());
    }
    public void doWork(){
        System.out.println("Checking facilities - repairing physical things - checking access and operations - lawn duties - washing the cars on the lots");
    }

    public int getDailyPay() {
        return dailyPay;
    }
}
