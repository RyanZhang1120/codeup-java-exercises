package oop_deeper_lectures;

public class Employee {
    //All employees would have an identity - name
    private String name;

    static int headcount = 0;

    public void sayHello(){
        System.out.printf("Hello there my name is: %s %n", this.name);
    }

    //If I tried to define "doWork" here.. not all employees do work the same way :(

    //We explored using the "Generate" menu for the first time
    //Right click > Generate OR cmd+N
    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
        headcount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
