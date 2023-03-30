package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        String string = input.getString("Enter a string: ");
        System.out.println("You entered: " + string);

        boolean yesNo = input.yesNo("Do you want to continue? (y/n): ");
        System.out.println("You entered: " + yesNo);

        int inputIn = input.getInt(1,10, "Enter a number from 1 to 10: ");
        System.out.println("You entered: " + inputIn);

        System.out.print("Enter a number: ");
        int inputIn2 = input.getInt();
        System.out.println("You entered: " + inputIn2);

        double inputDouble = input.getDouble(0.0, 10.0, "Enter a double from 1.0 to 10.0: ");
        System.out.println("You entered: " + inputDouble);

        double inputDouble2 = input.getDouble("Enter a double: ");
        System.out.println("You entered: " + inputDouble2);
    }
}
