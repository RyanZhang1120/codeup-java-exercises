package shapes;
import util.Input;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        boolean goOn;
        int counts = 0;
        do{
            counts++;
            double radius = input.getDouble("Enter a radius: ");
            Circle circle = new Circle(radius);
            System.out.println("Circumference: " + circle.getCircumference());
            System.out.println("Area: " + circle.getArea());
            goOn= input.yesNo("One more circle? ");

        }while(goOn);
        System.out.println("Circle counted: " + counts);
    }
}
