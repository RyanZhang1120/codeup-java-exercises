import java.util.Scanner;
public class Console {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");


//        System.out.print("Enter something: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.print("Enter length: ");
        int length = scanner.nextInt();

        System.out.print("Enter width: ");
        int width = scanner.nextInt();

        System.out.println("The area:  " + length * width );
        System.out.println("The Perimeter:  " + (length * 2 +  width * 2) );

    }
}
