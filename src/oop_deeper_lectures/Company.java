package oop_deeper_lectures;

public class Company {

    //We will run our hypothetical company code in here
    //To 'run' something, we need an entry point to our application - a MAIN
    public static void main(String[] args) {
        Salesperson salesBot = new Salesperson("RoboSales2000", 1125);

        MaintainencePerson maintainBot = new MaintainencePerson("SuperCleaner99", 412);

        Salesperson roboKen = new Salesperson("ken2cool", 415);
        //sayHello() comes from employee (example1)
        salesBot.sayHello();
        maintainBot.sayHello();

        //doWork() comes form each unique subclass
        maintainBot.doWork();
        roboKen.doWork();

        System.out.println("maintainBot.getDailyPay() = " + maintainBot.getDailyPay());

        System.out.println("salesBot.getDailyPay() = " + salesBot.getDailyPay());

        System.out.println("roboKen.getDailyPay() = " + roboKen.getDailyPay());

        //override - sayHello now comes from the subclass (example2 of sayHello)
        //salesBot.sayHello();
        //maintainBot.sayHello();
//
        System.out.printf("How many folks work here? %d %n", Employee.headcount);

        System.out.printf("How many salespeople do we have? %d %n", Salesperson.numSalesPeople);

        System.out.printf("How many maint folks do we have? %d %n", MaintainencePerson.numMaintPeople);

        //Polymorphism
        //A subclass puts on the 'clothes', the appearance, literally the DATA TYPE of the SUPERCLASS

        //Superclass is EMPLOYEE
        Employee employeeExamplePoly = new Employee("exampleName");

        System.out.println("employeeExamplePoly.getName() = " + employeeExamplePoly.getName());

        //Subclass is SALESPERSON
        Employee polymorphingVariable = new Salesperson("saleExamplePoly", 100);

        employeeExamplePoly.sayHello(); //Employee.sayHello() declaration/assignment was for an EMPLOYEE data type
        polymorphingVariable.sayHello(); //Salesperson.sayHello() declaration/assignment was for a SALESPERSON datatype
    }
}
